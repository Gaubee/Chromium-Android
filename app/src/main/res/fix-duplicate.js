//@ts-check
const fs = require("fs");
const path = require("path");
const RES_DIR = __dirname;
const LEVEL = new Map([
  [".png", 10],
  [".xml", 1],
]);
function fixDuplicate(resDir) {
  for (const item of fs.readdirSync(resDir)) {
    const subDir = path.join(resDir, item);
    if (!fs.statSync(subDir).isDirectory()) {
      continue;
    }
    /**
     * @type Map<string,path.ParsedPath>
     */
    const subItemNames = new Map();
    for (const subItem of fs.readdirSync(subDir)) {
      const subItemInfo = path.parse(subItem);
      const oldSubItemInfo = subItemNames.get(subItemInfo.name);
      if (oldSubItemInfo === undefined) {
        subItemNames.set(subItemInfo.name, subItemInfo);
      } else {
        const oldLevel = LEVEL.get(oldSubItemInfo.ext);
        const newLevel = LEVEL.get(subItemInfo.ext);
        if (oldLevel === undefined || newLevel === undefined) {
          throw new TypeError(oldSubItemInfo.base + "," + subItemInfo.base);
        }
        if (newLevel > oldLevel) {
          console.log("rm", oldSubItemInfo.base);
          fs.unlinkSync(path.join(subDir, oldSubItemInfo.base));
          subItemNames.set(subItemInfo.name, subItemInfo);
        } else {
          console.log("rm", subItemInfo.base);
          fs.unlinkSync(path.join(subDir, subItemInfo.base));
        }
      }
    }
  }
}

fixDuplicate(RES_DIR);
