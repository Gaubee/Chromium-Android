// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Show contextual information.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.ShowDetailsProto}
 */
public  final class ShowDetailsProto extends
    com.google.protobuf.GeneratedMessageLite<
        ShowDetailsProto, ShowDetailsProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.ShowDetailsProto)
    ShowDetailsProtoOrBuilder {
  private ShowDetailsProto() {
  }
  private int bitField0_;
  private int dataToShowCase_ = 0;
  private java.lang.Object dataToShow_;
  public enum DataToShowCase {
    DETAILS(1),
    CONTACT_DETAILS(3),
    CREDIT_CARD(4),
    SHIPPING_ADDRESS(5),
    DATATOSHOW_NOT_SET(0);
    private final int value;
    private DataToShowCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DataToShowCase valueOf(int value) {
      return forNumber(value);
    }

    public static DataToShowCase forNumber(int value) {
      switch (value) {
        case 1: return DETAILS;
        case 3: return CONTACT_DETAILS;
        case 4: return CREDIT_CARD;
        case 5: return SHIPPING_ADDRESS;
        case 0: return DATATOSHOW_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  @java.lang.Override
  public DataToShowCase
  getDataToShowCase() {
    return DataToShowCase.forNumber(
        dataToShowCase_);
  }

  private void clearDataToShow() {
    dataToShowCase_ = 0;
    dataToShow_ = null;
  }

  public static final int DETAILS_FIELD_NUMBER = 1;
  /**
   * <code>.autofill_assistant.DetailsProto details = 1;</code>
   */
  @java.lang.Override
  public boolean hasDetails() {
    return dataToShowCase_ == 1;
  }
  /**
   * <code>.autofill_assistant.DetailsProto details = 1;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.DetailsProto getDetails() {
    if (dataToShowCase_ == 1) {
       return (org.chromium.chrome.browser.autofill_assistant.proto.DetailsProto) dataToShow_;
    }
    return org.chromium.chrome.browser.autofill_assistant.proto.DetailsProto.getDefaultInstance();
  }
  /**
   * <code>.autofill_assistant.DetailsProto details = 1;</code>
   */
  private void setDetails(org.chromium.chrome.browser.autofill_assistant.proto.DetailsProto value) {
    value.getClass();
  dataToShow_ = value;
    dataToShowCase_ = 1;
  }
  /**
   * <code>.autofill_assistant.DetailsProto details = 1;</code>
   */
  private void mergeDetails(org.chromium.chrome.browser.autofill_assistant.proto.DetailsProto value) {
    value.getClass();
  if (dataToShowCase_ == 1 &&
        dataToShow_ != org.chromium.chrome.browser.autofill_assistant.proto.DetailsProto.getDefaultInstance()) {
      dataToShow_ = org.chromium.chrome.browser.autofill_assistant.proto.DetailsProto.newBuilder((org.chromium.chrome.browser.autofill_assistant.proto.DetailsProto) dataToShow_)
          .mergeFrom(value).buildPartial();
    } else {
      dataToShow_ = value;
    }
    dataToShowCase_ = 1;
  }
  /**
   * <code>.autofill_assistant.DetailsProto details = 1;</code>
   */
  private void clearDetails() {
    if (dataToShowCase_ == 1) {
      dataToShowCase_ = 0;
      dataToShow_ = null;
    }
  }

  public static final int CONTACT_DETAILS_FIELD_NUMBER = 3;
  /**
   * <pre>
   * Shows full name and email address.
   * </pre>
   *
   * <code>string contact_details = 3;</code>
   * @return Whether the contactDetails field is set.
   */
  @java.lang.Override
  public boolean hasContactDetails() {
    return dataToShowCase_ == 3;
  }
  /**
   * <pre>
   * Shows full name and email address.
   * </pre>
   *
   * <code>string contact_details = 3;</code>
   * @return The contactDetails.
   */
  @java.lang.Override
  public java.lang.String getContactDetails() {
    java.lang.String ref = "";
    if (dataToShowCase_ == 3) {
      ref = (java.lang.String) dataToShow_;
    }
    return ref;
  }
  /**
   * <pre>
   * Shows full name and email address.
   * </pre>
   *
   * <code>string contact_details = 3;</code>
   * @return The bytes for contactDetails.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getContactDetailsBytes() {
    java.lang.String ref = "";
    if (dataToShowCase_ == 3) {
      ref = (java.lang.String) dataToShow_;
    }
    return com.google.protobuf.ByteString.copyFromUtf8(ref);
  }
  /**
   * <pre>
   * Shows full name and email address.
   * </pre>
   *
   * <code>string contact_details = 3;</code>
   * @param value The contactDetails to set.
   */
  private void setContactDetails(
      java.lang.String value) {
    value.getClass();
  dataToShowCase_ = 3;
    dataToShow_ = value;
  }
  /**
   * <pre>
   * Shows full name and email address.
   * </pre>
   *
   * <code>string contact_details = 3;</code>
   */
  private void clearContactDetails() {
    if (dataToShowCase_ == 3) {
      dataToShowCase_ = 0;
      dataToShow_ = null;
    }
  }
  /**
   * <pre>
   * Shows full name and email address.
   * </pre>
   *
   * <code>string contact_details = 3;</code>
   * @param value The bytes for contactDetails to set.
   */
  private void setContactDetailsBytes(
      com.google.protobuf.ByteString value) {
    dataToShow_ = value.toStringUtf8();
    dataToShowCase_ = 3;
  }

  public static final int CREDIT_CARD_FIELD_NUMBER = 4;
  /**
   * <code>bool credit_card = 4;</code>
   * @return Whether the creditCard field is set.
   */
  @java.lang.Override
  public boolean hasCreditCard() {
    return dataToShowCase_ == 4;
  }
  /**
   * <code>bool credit_card = 4;</code>
   * @return The creditCard.
   */
  @java.lang.Override
  public boolean getCreditCard() {
    if (dataToShowCase_ == 4) {
      return (java.lang.Boolean) dataToShow_;
    }
    return false;
  }
  /**
   * <code>bool credit_card = 4;</code>
   * @param value The creditCard to set.
   */
  private void setCreditCard(boolean value) {
    dataToShowCase_ = 4;
    dataToShow_ = value;
  }
  /**
   * <code>bool credit_card = 4;</code>
   */
  private void clearCreditCard() {
    if (dataToShowCase_ == 4) {
      dataToShowCase_ = 0;
      dataToShow_ = null;
    }
  }

  public static final int SHIPPING_ADDRESS_FIELD_NUMBER = 5;
  /**
   * <pre>
   * Shows full name and address.
   * </pre>
   *
   * <code>string shipping_address = 5;</code>
   * @return Whether the shippingAddress field is set.
   */
  @java.lang.Override
  public boolean hasShippingAddress() {
    return dataToShowCase_ == 5;
  }
  /**
   * <pre>
   * Shows full name and address.
   * </pre>
   *
   * <code>string shipping_address = 5;</code>
   * @return The shippingAddress.
   */
  @java.lang.Override
  public java.lang.String getShippingAddress() {
    java.lang.String ref = "";
    if (dataToShowCase_ == 5) {
      ref = (java.lang.String) dataToShow_;
    }
    return ref;
  }
  /**
   * <pre>
   * Shows full name and address.
   * </pre>
   *
   * <code>string shipping_address = 5;</code>
   * @return The bytes for shippingAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getShippingAddressBytes() {
    java.lang.String ref = "";
    if (dataToShowCase_ == 5) {
      ref = (java.lang.String) dataToShow_;
    }
    return com.google.protobuf.ByteString.copyFromUtf8(ref);
  }
  /**
   * <pre>
   * Shows full name and address.
   * </pre>
   *
   * <code>string shipping_address = 5;</code>
   * @param value The shippingAddress to set.
   */
  private void setShippingAddress(
      java.lang.String value) {
    value.getClass();
  dataToShowCase_ = 5;
    dataToShow_ = value;
  }
  /**
   * <pre>
   * Shows full name and address.
   * </pre>
   *
   * <code>string shipping_address = 5;</code>
   */
  private void clearShippingAddress() {
    if (dataToShowCase_ == 5) {
      dataToShowCase_ = 0;
      dataToShow_ = null;
    }
  }
  /**
   * <pre>
   * Shows full name and address.
   * </pre>
   *
   * <code>string shipping_address = 5;</code>
   * @param value The bytes for shippingAddress to set.
   */
  private void setShippingAddressBytes(
      com.google.protobuf.ByteString value) {
    dataToShow_ = value.toStringUtf8();
    dataToShowCase_ = 5;
  }

  public static final int CHANGE_FLAGS_FIELD_NUMBER = 2;
  private org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProto changeFlags_;
  /**
   * <pre>
   * Flags indicating which parts of the details (if any) have changed.
   * This field is taken into account only if |details| is filled.
   * </pre>
   *
   * <code>optional .autofill_assistant.DetailsChangesProto change_flags = 2;</code>
   */
  @java.lang.Override
  public boolean hasChangeFlags() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <pre>
   * Flags indicating which parts of the details (if any) have changed.
   * This field is taken into account only if |details| is filled.
   * </pre>
   *
   * <code>optional .autofill_assistant.DetailsChangesProto change_flags = 2;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProto getChangeFlags() {
    return changeFlags_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProto.getDefaultInstance() : changeFlags_;
  }
  /**
   * <pre>
   * Flags indicating which parts of the details (if any) have changed.
   * This field is taken into account only if |details| is filled.
   * </pre>
   *
   * <code>optional .autofill_assistant.DetailsChangesProto change_flags = 2;</code>
   */
  private void setChangeFlags(org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProto value) {
    value.getClass();
  changeFlags_ = value;
    bitField0_ |= 0x00000010;
    }
  /**
   * <pre>
   * Flags indicating which parts of the details (if any) have changed.
   * This field is taken into account only if |details| is filled.
   * </pre>
   *
   * <code>optional .autofill_assistant.DetailsChangesProto change_flags = 2;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeChangeFlags(org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProto value) {
    value.getClass();
  if (changeFlags_ != null &&
        changeFlags_ != org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProto.getDefaultInstance()) {
      changeFlags_ =
        org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProto.newBuilder(changeFlags_).mergeFrom(value).buildPartial();
    } else {
      changeFlags_ = value;
    }
    bitField0_ |= 0x00000010;
  }
  /**
   * <pre>
   * Flags indicating which parts of the details (if any) have changed.
   * This field is taken into account only if |details| is filled.
   * </pre>
   *
   * <code>optional .autofill_assistant.DetailsChangesProto change_flags = 2;</code>
   */
  private void clearChangeFlags() {  changeFlags_ = null;
    bitField0_ = (bitField0_ & ~0x00000010);
  }

  public static final int APPEND_FIELD_NUMBER = 6;
  private boolean append_;
  /**
   * <pre>
   * Whether the details should be added/appended instead of replacing the
   * current details.
   * </pre>
   *
   * <code>optional bool append = 6;</code>
   * @return Whether the append field is set.
   */
  @java.lang.Override
  public boolean hasAppend() {
    return ((bitField0_ & 0x00000020) != 0);
  }
  /**
   * <pre>
   * Whether the details should be added/appended instead of replacing the
   * current details.
   * </pre>
   *
   * <code>optional bool append = 6;</code>
   * @return The append.
   */
  @java.lang.Override
  public boolean getAppend() {
    return append_;
  }
  /**
   * <pre>
   * Whether the details should be added/appended instead of replacing the
   * current details.
   * </pre>
   *
   * <code>optional bool append = 6;</code>
   * @param value The append to set.
   */
  private void setAppend(boolean value) {
    bitField0_ |= 0x00000020;
    append_ = value;
  }
  /**
   * <pre>
   * Whether the details should be added/appended instead of replacing the
   * current details.
   * </pre>
   *
   * <code>optional bool append = 6;</code>
   */
  private void clearAppend() {
    bitField0_ = (bitField0_ & ~0x00000020);
    append_ = false;
  }

  public static final int DELAY_MS_FIELD_NUMBER = 7;
  private int delayMs_;
  /**
   * <pre>
   * If set, add a delay of |delay_ms| before setting/appending the details.
   * The details will never be shown if another ShowDetailsProto action with
   * |append| = false is sent after this action and before the delay is reached.
   * Note that it's not possible to delay the clearing of the details. If
   * |data_to_show| is not set, then the details will be cleared directly.
   * </pre>
   *
   * <code>optional int32 delay_ms = 7;</code>
   * @return Whether the delayMs field is set.
   */
  @java.lang.Override
  public boolean hasDelayMs() {
    return ((bitField0_ & 0x00000040) != 0);
  }
  /**
   * <pre>
   * If set, add a delay of |delay_ms| before setting/appending the details.
   * The details will never be shown if another ShowDetailsProto action with
   * |append| = false is sent after this action and before the delay is reached.
   * Note that it's not possible to delay the clearing of the details. If
   * |data_to_show| is not set, then the details will be cleared directly.
   * </pre>
   *
   * <code>optional int32 delay_ms = 7;</code>
   * @return The delayMs.
   */
  @java.lang.Override
  public int getDelayMs() {
    return delayMs_;
  }
  /**
   * <pre>
   * If set, add a delay of |delay_ms| before setting/appending the details.
   * The details will never be shown if another ShowDetailsProto action with
   * |append| = false is sent after this action and before the delay is reached.
   * Note that it's not possible to delay the clearing of the details. If
   * |data_to_show| is not set, then the details will be cleared directly.
   * </pre>
   *
   * <code>optional int32 delay_ms = 7;</code>
   * @param value The delayMs to set.
   */
  private void setDelayMs(int value) {
    bitField0_ |= 0x00000040;
    delayMs_ = value;
  }
  /**
   * <pre>
   * If set, add a delay of |delay_ms| before setting/appending the details.
   * The details will never be shown if another ShowDetailsProto action with
   * |append| = false is sent after this action and before the delay is reached.
   * Note that it's not possible to delay the clearing of the details. If
   * |data_to_show| is not set, then the details will be cleared directly.
   * </pre>
   *
   * <code>optional int32 delay_ms = 7;</code>
   */
  private void clearDelayMs() {
    bitField0_ = (bitField0_ & ~0x00000040);
    delayMs_ = 0;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowDetailsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowDetailsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowDetailsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowDetailsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowDetailsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowDetailsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowDetailsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowDetailsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowDetailsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowDetailsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowDetailsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowDetailsProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.ShowDetailsProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Show contextual information.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.ShowDetailsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.ShowDetailsProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.ShowDetailsProto)
      org.chromium.chrome.browser.autofill_assistant.proto.ShowDetailsProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.ShowDetailsProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }

    @java.lang.Override
    public DataToShowCase
        getDataToShowCase() {
      return instance.getDataToShowCase();
    }

    public Builder clearDataToShow() {
      copyOnWrite();
      instance.clearDataToShow();
      return this;
    }


    /**
     * <code>.autofill_assistant.DetailsProto details = 1;</code>
     */
    @java.lang.Override
    public boolean hasDetails() {
      return instance.hasDetails();
    }
    /**
     * <code>.autofill_assistant.DetailsProto details = 1;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.DetailsProto getDetails() {
      return instance.getDetails();
    }
    /**
     * <code>.autofill_assistant.DetailsProto details = 1;</code>
     */
    public Builder setDetails(org.chromium.chrome.browser.autofill_assistant.proto.DetailsProto value) {
      copyOnWrite();
      instance.setDetails(value);
      return this;
    }
    /**
     * <code>.autofill_assistant.DetailsProto details = 1;</code>
     */
    public Builder setDetails(
        org.chromium.chrome.browser.autofill_assistant.proto.DetailsProto.Builder builderForValue) {
      copyOnWrite();
      instance.setDetails(builderForValue.build());
      return this;
    }
    /**
     * <code>.autofill_assistant.DetailsProto details = 1;</code>
     */
    public Builder mergeDetails(org.chromium.chrome.browser.autofill_assistant.proto.DetailsProto value) {
      copyOnWrite();
      instance.mergeDetails(value);
      return this;
    }
    /**
     * <code>.autofill_assistant.DetailsProto details = 1;</code>
     */
    public Builder clearDetails() {
      copyOnWrite();
      instance.clearDetails();
      return this;
    }

    /**
     * <pre>
     * Shows full name and email address.
     * </pre>
     *
     * <code>string contact_details = 3;</code>
     * @return Whether the contactDetails field is set.
     */
    @java.lang.Override
    public boolean hasContactDetails() {
      return instance.hasContactDetails();
    }
    /**
     * <pre>
     * Shows full name and email address.
     * </pre>
     *
     * <code>string contact_details = 3;</code>
     * @return The contactDetails.
     */
    @java.lang.Override
    public java.lang.String getContactDetails() {
      return instance.getContactDetails();
    }
    /**
     * <pre>
     * Shows full name and email address.
     * </pre>
     *
     * <code>string contact_details = 3;</code>
     * @return The bytes for contactDetails.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getContactDetailsBytes() {
      return instance.getContactDetailsBytes();
    }
    /**
     * <pre>
     * Shows full name and email address.
     * </pre>
     *
     * <code>string contact_details = 3;</code>
     * @param value The contactDetails to set.
     * @return This builder for chaining.
     */
    public Builder setContactDetails(
        java.lang.String value) {
      copyOnWrite();
      instance.setContactDetails(value);
      return this;
    }
    /**
     * <pre>
     * Shows full name and email address.
     * </pre>
     *
     * <code>string contact_details = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearContactDetails() {
      copyOnWrite();
      instance.clearContactDetails();
      return this;
    }
    /**
     * <pre>
     * Shows full name and email address.
     * </pre>
     *
     * <code>string contact_details = 3;</code>
     * @param value The bytes for contactDetails to set.
     * @return This builder for chaining.
     */
    public Builder setContactDetailsBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setContactDetailsBytes(value);
      return this;
    }

    /**
     * <code>bool credit_card = 4;</code>
     * @return Whether the creditCard field is set.
     */
    @java.lang.Override
    public boolean hasCreditCard() {
      return instance.hasCreditCard();
    }
    /**
     * <code>bool credit_card = 4;</code>
     * @return The creditCard.
     */
    @java.lang.Override
    public boolean getCreditCard() {
      return instance.getCreditCard();
    }
    /**
     * <code>bool credit_card = 4;</code>
     * @param value The creditCard to set.
     * @return This builder for chaining.
     */
    public Builder setCreditCard(boolean value) {
      copyOnWrite();
      instance.setCreditCard(value);
      return this;
    }
    /**
     * <code>bool credit_card = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCreditCard() {
      copyOnWrite();
      instance.clearCreditCard();
      return this;
    }

    /**
     * <pre>
     * Shows full name and address.
     * </pre>
     *
     * <code>string shipping_address = 5;</code>
     * @return Whether the shippingAddress field is set.
     */
    @java.lang.Override
    public boolean hasShippingAddress() {
      return instance.hasShippingAddress();
    }
    /**
     * <pre>
     * Shows full name and address.
     * </pre>
     *
     * <code>string shipping_address = 5;</code>
     * @return The shippingAddress.
     */
    @java.lang.Override
    public java.lang.String getShippingAddress() {
      return instance.getShippingAddress();
    }
    /**
     * <pre>
     * Shows full name and address.
     * </pre>
     *
     * <code>string shipping_address = 5;</code>
     * @return The bytes for shippingAddress.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getShippingAddressBytes() {
      return instance.getShippingAddressBytes();
    }
    /**
     * <pre>
     * Shows full name and address.
     * </pre>
     *
     * <code>string shipping_address = 5;</code>
     * @param value The shippingAddress to set.
     * @return This builder for chaining.
     */
    public Builder setShippingAddress(
        java.lang.String value) {
      copyOnWrite();
      instance.setShippingAddress(value);
      return this;
    }
    /**
     * <pre>
     * Shows full name and address.
     * </pre>
     *
     * <code>string shipping_address = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearShippingAddress() {
      copyOnWrite();
      instance.clearShippingAddress();
      return this;
    }
    /**
     * <pre>
     * Shows full name and address.
     * </pre>
     *
     * <code>string shipping_address = 5;</code>
     * @param value The bytes for shippingAddress to set.
     * @return This builder for chaining.
     */
    public Builder setShippingAddressBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setShippingAddressBytes(value);
      return this;
    }

    /**
     * <pre>
     * Flags indicating which parts of the details (if any) have changed.
     * This field is taken into account only if |details| is filled.
     * </pre>
     *
     * <code>optional .autofill_assistant.DetailsChangesProto change_flags = 2;</code>
     */
    @java.lang.Override
    public boolean hasChangeFlags() {
      return instance.hasChangeFlags();
    }
    /**
     * <pre>
     * Flags indicating which parts of the details (if any) have changed.
     * This field is taken into account only if |details| is filled.
     * </pre>
     *
     * <code>optional .autofill_assistant.DetailsChangesProto change_flags = 2;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProto getChangeFlags() {
      return instance.getChangeFlags();
    }
    /**
     * <pre>
     * Flags indicating which parts of the details (if any) have changed.
     * This field is taken into account only if |details| is filled.
     * </pre>
     *
     * <code>optional .autofill_assistant.DetailsChangesProto change_flags = 2;</code>
     */
    public Builder setChangeFlags(org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProto value) {
      copyOnWrite();
      instance.setChangeFlags(value);
      return this;
      }
    /**
     * <pre>
     * Flags indicating which parts of the details (if any) have changed.
     * This field is taken into account only if |details| is filled.
     * </pre>
     *
     * <code>optional .autofill_assistant.DetailsChangesProto change_flags = 2;</code>
     */
    public Builder setChangeFlags(
        org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProto.Builder builderForValue) {
      copyOnWrite();
      instance.setChangeFlags(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Flags indicating which parts of the details (if any) have changed.
     * This field is taken into account only if |details| is filled.
     * </pre>
     *
     * <code>optional .autofill_assistant.DetailsChangesProto change_flags = 2;</code>
     */
    public Builder mergeChangeFlags(org.chromium.chrome.browser.autofill_assistant.proto.DetailsChangesProto value) {
      copyOnWrite();
      instance.mergeChangeFlags(value);
      return this;
    }
    /**
     * <pre>
     * Flags indicating which parts of the details (if any) have changed.
     * This field is taken into account only if |details| is filled.
     * </pre>
     *
     * <code>optional .autofill_assistant.DetailsChangesProto change_flags = 2;</code>
     */
    public Builder clearChangeFlags() {  copyOnWrite();
      instance.clearChangeFlags();
      return this;
    }

    /**
     * <pre>
     * Whether the details should be added/appended instead of replacing the
     * current details.
     * </pre>
     *
     * <code>optional bool append = 6;</code>
     * @return Whether the append field is set.
     */
    @java.lang.Override
    public boolean hasAppend() {
      return instance.hasAppend();
    }
    /**
     * <pre>
     * Whether the details should be added/appended instead of replacing the
     * current details.
     * </pre>
     *
     * <code>optional bool append = 6;</code>
     * @return The append.
     */
    @java.lang.Override
    public boolean getAppend() {
      return instance.getAppend();
    }
    /**
     * <pre>
     * Whether the details should be added/appended instead of replacing the
     * current details.
     * </pre>
     *
     * <code>optional bool append = 6;</code>
     * @param value The append to set.
     * @return This builder for chaining.
     */
    public Builder setAppend(boolean value) {
      copyOnWrite();
      instance.setAppend(value);
      return this;
    }
    /**
     * <pre>
     * Whether the details should be added/appended instead of replacing the
     * current details.
     * </pre>
     *
     * <code>optional bool append = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearAppend() {
      copyOnWrite();
      instance.clearAppend();
      return this;
    }

    /**
     * <pre>
     * If set, add a delay of |delay_ms| before setting/appending the details.
     * The details will never be shown if another ShowDetailsProto action with
     * |append| = false is sent after this action and before the delay is reached.
     * Note that it's not possible to delay the clearing of the details. If
     * |data_to_show| is not set, then the details will be cleared directly.
     * </pre>
     *
     * <code>optional int32 delay_ms = 7;</code>
     * @return Whether the delayMs field is set.
     */
    @java.lang.Override
    public boolean hasDelayMs() {
      return instance.hasDelayMs();
    }
    /**
     * <pre>
     * If set, add a delay of |delay_ms| before setting/appending the details.
     * The details will never be shown if another ShowDetailsProto action with
     * |append| = false is sent after this action and before the delay is reached.
     * Note that it's not possible to delay the clearing of the details. If
     * |data_to_show| is not set, then the details will be cleared directly.
     * </pre>
     *
     * <code>optional int32 delay_ms = 7;</code>
     * @return The delayMs.
     */
    @java.lang.Override
    public int getDelayMs() {
      return instance.getDelayMs();
    }
    /**
     * <pre>
     * If set, add a delay of |delay_ms| before setting/appending the details.
     * The details will never be shown if another ShowDetailsProto action with
     * |append| = false is sent after this action and before the delay is reached.
     * Note that it's not possible to delay the clearing of the details. If
     * |data_to_show| is not set, then the details will be cleared directly.
     * </pre>
     *
     * <code>optional int32 delay_ms = 7;</code>
     * @param value The delayMs to set.
     * @return This builder for chaining.
     */
    public Builder setDelayMs(int value) {
      copyOnWrite();
      instance.setDelayMs(value);
      return this;
    }
    /**
     * <pre>
     * If set, add a delay of |delay_ms| before setting/appending the details.
     * The details will never be shown if another ShowDetailsProto action with
     * |append| = false is sent after this action and before the delay is reached.
     * Note that it's not possible to delay the clearing of the details. If
     * |data_to_show| is not set, then the details will be cleared directly.
     * </pre>
     *
     * <code>optional int32 delay_ms = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearDelayMs() {
      copyOnWrite();
      instance.clearDelayMs();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.ShowDetailsProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.ShowDetailsProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "dataToShow_",
            "dataToShowCase_",
            "bitField0_",
            org.chromium.chrome.browser.autofill_assistant.proto.DetailsProto.class,
            "changeFlags_",
            "append_",
            "delayMs_",
          };
          java.lang.String info =
              "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u103c\u0000\u0002" +
              "\u1009\u0004\u0003\u103b\u0000\u0004\u103a\u0000\u0005\u103b\u0000\u0006\u1007\u0005" +
              "\u0007\u1004\u0006";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.ShowDetailsProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.ShowDetailsProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.ShowDetailsProto>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:autofill_assistant.ShowDetailsProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.ShowDetailsProto DEFAULT_INSTANCE;
  static {
    ShowDetailsProto defaultInstance = new ShowDetailsProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ShowDetailsProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ShowDetailsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ShowDetailsProto> PARSER;

  public static com.google.protobuf.Parser<ShowDetailsProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

