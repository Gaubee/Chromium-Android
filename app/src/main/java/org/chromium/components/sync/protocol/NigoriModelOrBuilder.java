// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/nigori_local_data.proto

package org.chromium.components.sync.protocol;

public interface NigoriModelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.NigoriModel)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Represents state of the cryptographer.
   * </pre>
   *
   * <code>optional .sync_pb.CryptographerData cryptographer_data = 1;</code>
   * @return Whether the cryptographerData field is set.
   */
  boolean hasCryptographerData();
  /**
   * <pre>
   * Represents state of the cryptographer.
   * </pre>
   *
   * <code>optional .sync_pb.CryptographerData cryptographer_data = 1;</code>
   * @return The cryptographerData.
   */
  org.chromium.components.sync.protocol.CryptographerData getCryptographerData();

  /**
   * <pre>
   * Contains the name of the key, used for encryption of
   * NigoriSpecifics.keystore_decryptor_token, should always be the name of the
   * latest keystore key. Equals to cryptographer_data.default_key_name iff it
   * is Nigori in full keystore mode (not in backward compatible keystore
   * mode).
   * </pre>
   *
   * <code>optional string current_keystore_key_name = 2;</code>
   * @return Whether the currentKeystoreKeyName field is set.
   */
  boolean hasCurrentKeystoreKeyName();
  /**
   * <pre>
   * Contains the name of the key, used for encryption of
   * NigoriSpecifics.keystore_decryptor_token, should always be the name of the
   * latest keystore key. Equals to cryptographer_data.default_key_name iff it
   * is Nigori in full keystore mode (not in backward compatible keystore
   * mode).
   * </pre>
   *
   * <code>optional string current_keystore_key_name = 2;</code>
   * @return The currentKeystoreKeyName.
   */
  java.lang.String getCurrentKeystoreKeyName();
  /**
   * <pre>
   * Contains the name of the key, used for encryption of
   * NigoriSpecifics.keystore_decryptor_token, should always be the name of the
   * latest keystore key. Equals to cryptographer_data.default_key_name iff it
   * is Nigori in full keystore mode (not in backward compatible keystore
   * mode).
   * </pre>
   *
   * <code>optional string current_keystore_key_name = 2;</code>
   * @return The bytes for currentKeystoreKeyName.
   */
  com.google.protobuf.ByteString
      getCurrentKeystoreKeyNameBytes();

  /**
   * <pre>
   * Contains keybag in encrypted form, should be empty once we were able to
   * decrypt keybag from specifics.
   * </pre>
   *
   * <code>optional .sync_pb.EncryptedData pending_keys = 3;</code>
   * @return Whether the pendingKeys field is set.
   */
  boolean hasPendingKeys();
  /**
   * <pre>
   * Contains keybag in encrypted form, should be empty once we were able to
   * decrypt keybag from specifics.
   * </pre>
   *
   * <code>optional .sync_pb.EncryptedData pending_keys = 3;</code>
   * @return The pendingKeys.
   */
  org.chromium.components.sync.protocol.EncryptedData getPendingKeys();

  /**
   * <pre>
   * PassphraseType used for encryption. IMPLICIT_PASSPRHASE shouldn't be used
   * here.
   * </pre>
   *
   * <code>optional .sync_pb.NigoriSpecifics.PassphraseType passphrase_type = 4 [default = UNKNOWN];</code>
   * @return Whether the passphraseType field is set.
   */
  boolean hasPassphraseType();
  /**
   * <pre>
   * PassphraseType used for encryption. IMPLICIT_PASSPRHASE shouldn't be used
   * here.
   * </pre>
   *
   * <code>optional .sync_pb.NigoriSpecifics.PassphraseType passphrase_type = 4 [default = UNKNOWN];</code>
   * @return The passphraseType.
   */
  org.chromium.components.sync.protocol.NigoriSpecifics.PassphraseType getPassphraseType();

  /**
   * <pre>
   * The time (in UNIX epoch milliseconds) at which the keystore migration was
   * performed.
   * </pre>
   *
   * <code>optional int64 keystore_migration_time = 5;</code>
   * @return Whether the keystoreMigrationTime field is set.
   */
  boolean hasKeystoreMigrationTime();
  /**
   * <pre>
   * The time (in UNIX epoch milliseconds) at which the keystore migration was
   * performed.
   * </pre>
   *
   * <code>optional int64 keystore_migration_time = 5;</code>
   * @return The keystoreMigrationTime.
   */
  long getKeystoreMigrationTime();

  /**
   * <pre>
   * The time (in UNIX epoch milliseconds) at which a custom passphrase was
   * set.
   * Note: this field may not be set if the custom passphrase was applied before
   * corresponding field in NigoriSpecifics was introduced.
   * </pre>
   *
   * <code>optional int64 custom_passphrase_time = 6;</code>
   * @return Whether the customPassphraseTime field is set.
   */
  boolean hasCustomPassphraseTime();
  /**
   * <pre>
   * The time (in UNIX epoch milliseconds) at which a custom passphrase was
   * set.
   * Note: this field may not be set if the custom passphrase was applied before
   * corresponding field in NigoriSpecifics was introduced.
   * </pre>
   *
   * <code>optional int64 custom_passphrase_time = 6;</code>
   * @return The customPassphraseTime.
   */
  long getCustomPassphraseTime();

  /**
   * <pre>
   * Params used for deriving keys from custom passphrase. Should be set iff
   * |passphrase_type| is CUSTOM_PASSPHRASE.
   * </pre>
   *
   * <code>optional .sync_pb.CustomPassphraseKeyDerivationParams custom_passphrase_key_derivation_params = 7;</code>
   * @return Whether the customPassphraseKeyDerivationParams field is set.
   */
  boolean hasCustomPassphraseKeyDerivationParams();
  /**
   * <pre>
   * Params used for deriving keys from custom passphrase. Should be set iff
   * |passphrase_type| is CUSTOM_PASSPHRASE.
   * </pre>
   *
   * <code>optional .sync_pb.CustomPassphraseKeyDerivationParams custom_passphrase_key_derivation_params = 7;</code>
   * @return The customPassphraseKeyDerivationParams.
   */
  org.chromium.components.sync.protocol.CustomPassphraseKeyDerivationParams getCustomPassphraseKeyDerivationParams();

  /**
   * <pre>
   * Indicates whether we need to encrypt all encryptable user types.
   * </pre>
   *
   * <code>optional bool encrypt_everything = 8;</code>
   * @return Whether the encryptEverything field is set.
   */
  boolean hasEncryptEverything();
  /**
   * <pre>
   * Indicates whether we need to encrypt all encryptable user types.
   * </pre>
   *
   * <code>optional bool encrypt_everything = 8;</code>
   * @return The encryptEverything.
   */
  boolean getEncryptEverything();

  /**
   * <pre>
   * The list of encrypted UserEncryptableTypes, represented by their specifics
   * field number.
   * </pre>
   *
   * <code>repeated int32 encrypted_types_specifics_field_number = 9;</code>
   * @return A list containing the encryptedTypesSpecificsFieldNumber.
   */
  java.util.List<java.lang.Integer> getEncryptedTypesSpecificsFieldNumberList();
  /**
   * <pre>
   * The list of encrypted UserEncryptableTypes, represented by their specifics
   * field number.
   * </pre>
   *
   * <code>repeated int32 encrypted_types_specifics_field_number = 9;</code>
   * @return The count of encryptedTypesSpecificsFieldNumber.
   */
  int getEncryptedTypesSpecificsFieldNumberCount();
  /**
   * <pre>
   * The list of encrypted UserEncryptableTypes, represented by their specifics
   * field number.
   * </pre>
   *
   * <code>repeated int32 encrypted_types_specifics_field_number = 9;</code>
   * @param index The index of the element to return.
   * @return The encryptedTypesSpecificsFieldNumber at the given index.
   */
  int getEncryptedTypesSpecificsFieldNumber(int index);

  /**
   * <pre>
   * Keystore keys are used to decrypt keystore-based Nigori. Should be
   * persisted in order to not ask the keystore server for them during every
   * browser startup. Due to backward compatibility requirements keys are
   * always Base64 encoded.
   * </pre>
   *
   * <code>repeated string keystore_key = 10;</code>
   * @return A list containing the keystoreKey.
   */
  java.util.List<java.lang.String>
      getKeystoreKeyList();
  /**
   * <pre>
   * Keystore keys are used to decrypt keystore-based Nigori. Should be
   * persisted in order to not ask the keystore server for them during every
   * browser startup. Due to backward compatibility requirements keys are
   * always Base64 encoded.
   * </pre>
   *
   * <code>repeated string keystore_key = 10;</code>
   * @return The count of keystoreKey.
   */
  int getKeystoreKeyCount();
  /**
   * <pre>
   * Keystore keys are used to decrypt keystore-based Nigori. Should be
   * persisted in order to not ask the keystore server for them during every
   * browser startup. Due to backward compatibility requirements keys are
   * always Base64 encoded.
   * </pre>
   *
   * <code>repeated string keystore_key = 10;</code>
   * @param index The index of the element to return.
   * @return The keystoreKey at the given index.
   */
  java.lang.String getKeystoreKey(int index);
  /**
   * <pre>
   * Keystore keys are used to decrypt keystore-based Nigori. Should be
   * persisted in order to not ask the keystore server for them during every
   * browser startup. Due to backward compatibility requirements keys are
   * always Base64 encoded.
   * </pre>
   *
   * <code>repeated string keystore_key = 10;</code>
   * @param index The index of the element to return.
   * @return The keystoreKey at the given index.
   */
  com.google.protobuf.ByteString
      getKeystoreKeyBytes(int index);

  /**
   * <pre>
   * Encryptor keystore decryptor token. Used for decryption of keystore Nigori
   * in case keystore keys arrived after NigoriSpecifics.
   * </pre>
   *
   * <code>optional .sync_pb.EncryptedData pending_keystore_decryptor_token = 11;</code>
   * @return Whether the pendingKeystoreDecryptorToken field is set.
   */
  boolean hasPendingKeystoreDecryptorToken();
  /**
   * <pre>
   * Encryptor keystore decryptor token. Used for decryption of keystore Nigori
   * in case keystore keys arrived after NigoriSpecifics.
   * </pre>
   *
   * <code>optional .sync_pb.EncryptedData pending_keystore_decryptor_token = 11;</code>
   * @return The pendingKeystoreDecryptorToken.
   */
  org.chromium.components.sync.protocol.EncryptedData getPendingKeystoreDecryptorToken();

  /**
   * <pre>
   * Contains the name of the latest available trusted vault key that was used
   * as the default encryption key. Resets when the client go out of pending
   * decryption state and transits to other passphrase types.
   * </pre>
   *
   * <code>optional string last_default_trusted_vault_key_name = 12;</code>
   * @return Whether the lastDefaultTrustedVaultKeyName field is set.
   */
  boolean hasLastDefaultTrustedVaultKeyName();
  /**
   * <pre>
   * Contains the name of the latest available trusted vault key that was used
   * as the default encryption key. Resets when the client go out of pending
   * decryption state and transits to other passphrase types.
   * </pre>
   *
   * <code>optional string last_default_trusted_vault_key_name = 12;</code>
   * @return The lastDefaultTrustedVaultKeyName.
   */
  java.lang.String getLastDefaultTrustedVaultKeyName();
  /**
   * <pre>
   * Contains the name of the latest available trusted vault key that was used
   * as the default encryption key. Resets when the client go out of pending
   * decryption state and transits to other passphrase types.
   * </pre>
   *
   * <code>optional string last_default_trusted_vault_key_name = 12;</code>
   * @return The bytes for lastDefaultTrustedVaultKeyName.
   */
  com.google.protobuf.ByteString
      getLastDefaultTrustedVaultKeyNameBytes();
}
