// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: patientOrg.proto

package com.project;

public final class PatientOrg {
  private PatientOrg() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VacantBedInputOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VacantBedInput)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 roomType = 1;</code>
     */
    int getRoomType();
  }
  /**
   * Protobuf type {@code VacantBedInput}
   */
  public  static final class VacantBedInput extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:VacantBedInput)
      VacantBedInputOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VacantBedInput.newBuilder() to construct.
    private VacantBedInput(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VacantBedInput() {
      roomType_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private VacantBedInput(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              roomType_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.project.PatientOrg.internal_static_VacantBedInput_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.project.PatientOrg.internal_static_VacantBedInput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.project.PatientOrg.VacantBedInput.class, com.project.PatientOrg.VacantBedInput.Builder.class);
    }

    public static final int ROOMTYPE_FIELD_NUMBER = 1;
    private int roomType_;
    /**
     * <code>int32 roomType = 1;</code>
     */
    public int getRoomType() {
      return roomType_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (roomType_ != 0) {
        output.writeInt32(1, roomType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (roomType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, roomType_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.project.PatientOrg.VacantBedInput)) {
        return super.equals(obj);
      }
      com.project.PatientOrg.VacantBedInput other = (com.project.PatientOrg.VacantBedInput) obj;

      boolean result = true;
      result = result && (getRoomType()
          == other.getRoomType());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ROOMTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getRoomType();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.project.PatientOrg.VacantBedInput parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.project.PatientOrg.VacantBedInput parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.project.PatientOrg.VacantBedInput parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.project.PatientOrg.VacantBedInput parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.project.PatientOrg.VacantBedInput parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.project.PatientOrg.VacantBedInput parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.project.PatientOrg.VacantBedInput parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.project.PatientOrg.VacantBedInput parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.project.PatientOrg.VacantBedInput parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.project.PatientOrg.VacantBedInput parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.project.PatientOrg.VacantBedInput parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.project.PatientOrg.VacantBedInput parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.project.PatientOrg.VacantBedInput prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code VacantBedInput}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VacantBedInput)
        com.project.PatientOrg.VacantBedInputOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.project.PatientOrg.internal_static_VacantBedInput_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.project.PatientOrg.internal_static_VacantBedInput_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.project.PatientOrg.VacantBedInput.class, com.project.PatientOrg.VacantBedInput.Builder.class);
      }

      // Construct using com.project.PatientOrg.VacantBedInput.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        roomType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.project.PatientOrg.internal_static_VacantBedInput_descriptor;
      }

      @java.lang.Override
      public com.project.PatientOrg.VacantBedInput getDefaultInstanceForType() {
        return com.project.PatientOrg.VacantBedInput.getDefaultInstance();
      }

      @java.lang.Override
      public com.project.PatientOrg.VacantBedInput build() {
        com.project.PatientOrg.VacantBedInput result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.project.PatientOrg.VacantBedInput buildPartial() {
        com.project.PatientOrg.VacantBedInput result = new com.project.PatientOrg.VacantBedInput(this);
        result.roomType_ = roomType_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.project.PatientOrg.VacantBedInput) {
          return mergeFrom((com.project.PatientOrg.VacantBedInput)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.project.PatientOrg.VacantBedInput other) {
        if (other == com.project.PatientOrg.VacantBedInput.getDefaultInstance()) return this;
        if (other.getRoomType() != 0) {
          setRoomType(other.getRoomType());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.project.PatientOrg.VacantBedInput parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.project.PatientOrg.VacantBedInput) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int roomType_ ;
      /**
       * <code>int32 roomType = 1;</code>
       */
      public int getRoomType() {
        return roomType_;
      }
      /**
       * <code>int32 roomType = 1;</code>
       */
      public Builder setRoomType(int value) {
        
        roomType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 roomType = 1;</code>
       */
      public Builder clearRoomType() {
        
        roomType_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:VacantBedInput)
    }

    // @@protoc_insertion_point(class_scope:VacantBedInput)
    private static final com.project.PatientOrg.VacantBedInput DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.project.PatientOrg.VacantBedInput();
    }

    public static com.project.PatientOrg.VacantBedInput getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VacantBedInput>
        PARSER = new com.google.protobuf.AbstractParser<VacantBedInput>() {
      @java.lang.Override
      public VacantBedInput parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new VacantBedInput(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<VacantBedInput> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VacantBedInput> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.project.PatientOrg.VacantBedInput getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface VacantBedResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VacantBedResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 roomNumber = 1;</code>
     */
    int getRoomNumber();
  }
  /**
   * Protobuf type {@code VacantBedResponse}
   */
  public  static final class VacantBedResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:VacantBedResponse)
      VacantBedResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VacantBedResponse.newBuilder() to construct.
    private VacantBedResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VacantBedResponse() {
      roomNumber_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private VacantBedResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              roomNumber_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.project.PatientOrg.internal_static_VacantBedResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.project.PatientOrg.internal_static_VacantBedResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.project.PatientOrg.VacantBedResponse.class, com.project.PatientOrg.VacantBedResponse.Builder.class);
    }

    public static final int ROOMNUMBER_FIELD_NUMBER = 1;
    private int roomNumber_;
    /**
     * <code>int32 roomNumber = 1;</code>
     */
    public int getRoomNumber() {
      return roomNumber_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (roomNumber_ != 0) {
        output.writeInt32(1, roomNumber_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (roomNumber_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, roomNumber_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.project.PatientOrg.VacantBedResponse)) {
        return super.equals(obj);
      }
      com.project.PatientOrg.VacantBedResponse other = (com.project.PatientOrg.VacantBedResponse) obj;

      boolean result = true;
      result = result && (getRoomNumber()
          == other.getRoomNumber());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ROOMNUMBER_FIELD_NUMBER;
      hash = (53 * hash) + getRoomNumber();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.project.PatientOrg.VacantBedResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.project.PatientOrg.VacantBedResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.project.PatientOrg.VacantBedResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.project.PatientOrg.VacantBedResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.project.PatientOrg.VacantBedResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.project.PatientOrg.VacantBedResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.project.PatientOrg.VacantBedResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.project.PatientOrg.VacantBedResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.project.PatientOrg.VacantBedResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.project.PatientOrg.VacantBedResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.project.PatientOrg.VacantBedResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.project.PatientOrg.VacantBedResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.project.PatientOrg.VacantBedResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code VacantBedResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VacantBedResponse)
        com.project.PatientOrg.VacantBedResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.project.PatientOrg.internal_static_VacantBedResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.project.PatientOrg.internal_static_VacantBedResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.project.PatientOrg.VacantBedResponse.class, com.project.PatientOrg.VacantBedResponse.Builder.class);
      }

      // Construct using com.project.PatientOrg.VacantBedResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        roomNumber_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.project.PatientOrg.internal_static_VacantBedResponse_descriptor;
      }

      @java.lang.Override
      public com.project.PatientOrg.VacantBedResponse getDefaultInstanceForType() {
        return com.project.PatientOrg.VacantBedResponse.getDefaultInstance();
      }

      @java.lang.Override
      public com.project.PatientOrg.VacantBedResponse build() {
        com.project.PatientOrg.VacantBedResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.project.PatientOrg.VacantBedResponse buildPartial() {
        com.project.PatientOrg.VacantBedResponse result = new com.project.PatientOrg.VacantBedResponse(this);
        result.roomNumber_ = roomNumber_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.project.PatientOrg.VacantBedResponse) {
          return mergeFrom((com.project.PatientOrg.VacantBedResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.project.PatientOrg.VacantBedResponse other) {
        if (other == com.project.PatientOrg.VacantBedResponse.getDefaultInstance()) return this;
        if (other.getRoomNumber() != 0) {
          setRoomNumber(other.getRoomNumber());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.project.PatientOrg.VacantBedResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.project.PatientOrg.VacantBedResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int roomNumber_ ;
      /**
       * <code>int32 roomNumber = 1;</code>
       */
      public int getRoomNumber() {
        return roomNumber_;
      }
      /**
       * <code>int32 roomNumber = 1;</code>
       */
      public Builder setRoomNumber(int value) {
        
        roomNumber_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 roomNumber = 1;</code>
       */
      public Builder clearRoomNumber() {
        
        roomNumber_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:VacantBedResponse)
    }

    // @@protoc_insertion_point(class_scope:VacantBedResponse)
    private static final com.project.PatientOrg.VacantBedResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.project.PatientOrg.VacantBedResponse();
    }

    public static com.project.PatientOrg.VacantBedResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VacantBedResponse>
        PARSER = new com.google.protobuf.AbstractParser<VacantBedResponse>() {
      @java.lang.Override
      public VacantBedResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new VacantBedResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<VacantBedResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VacantBedResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.project.PatientOrg.VacantBedResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VacantBedInput_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VacantBedInput_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VacantBedResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VacantBedResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020patientOrg.proto\"\"\n\016VacantBedInput\022\020\n\010" +
      "roomType\030\001 \001(\005\"\'\n\021VacantBedResponse\022\022\n\nr" +
      "oomNumber\030\001 \001(\0052>\n\npatientOrg\0220\n\tVacantB" +
      "ed\022\017.VacantBedInput\032\022.VacantBedResponseB" +
      "\r\n\013com.projectb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_VacantBedInput_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VacantBedInput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VacantBedInput_descriptor,
        new java.lang.String[] { "RoomType", });
    internal_static_VacantBedResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_VacantBedResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VacantBedResponse_descriptor,
        new java.lang.String[] { "RoomNumber", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
