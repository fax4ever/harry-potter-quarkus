/*
 Generated by org.infinispan.protostream.annotations.impl.processor.AutoProtoSchemaBuilderAnnotationProcessor
 for class org.infinispan.hp.model.MonitoringAppContextInitializer
 annotated with @org.infinispan.protostream.annotations.AutoProtoSchemaBuilder(dependsOn=, marshallersOnly=false, service=true, autoImportClasses=false, excludeClasses=, includeClasses=org.infinispan.hp.model.HPCharacter,org.infinispan.hp.model.HPSpell,org.infinispan.hp.model.HPMagic,org.infinispan.hp.model.CharacterType, basePackages={}, value={}, schemaPackageName="hp_monitoring", schemaFilePath="", schemaFileName="", className="")
 */

package org.infinispan.hp.model;

/**
 * WARNING: Generated code! Do not edit!
 */
@javax.annotation.Generated(
   value = "org.infinispan.protostream.annotations.impl.processor.AutoProtoSchemaBuilderAnnotationProcessor",
   comments = "Please do not edit this file!"
)
@org.infinispan.protostream.annotations.impl.processor.OriginatingClasses({
   org.infinispan.hp.model.CharacterType.class,
   org.infinispan.hp.model.HPCharacter.class,
   org.infinispan.hp.model.HPMagic.class,
   org.infinispan.hp.model.HPSpell.class
})
/*@org.infinispan.protostream.annotations.AutoProtoSchemaBuilder(
   className = "MonitoringAppContextInitializerImpl",
   schemaFileName = "MonitoringAppContextInitializer.proto",
   schemaFilePath = "",
   schemaPackageName = "hp_monitoring",
   service = true,
   marshallersOnly = false,
   autoImportClasses = false,
   includeClasses = {
      org.infinispan.hp.model.CharacterType.class,
      org.infinispan.hp.model.HPCharacter.class,
      org.infinispan.hp.model.HPMagic.class,
      org.infinispan.hp.model.HPSpell.class
   }
)*/
@SuppressWarnings("all")
public class MonitoringAppContextInitializerImpl implements org.infinispan.hp.model.MonitoringAppContextInitializer, org.infinispan.protostream.GeneratedSchema {

   private static final String PROTO_SCHEMA = "// File name: MonitoringAppContextInitializer.proto\n" +
   "// Generated from : org.infinispan.hp.model.MonitoringAppContextInitializer\n" +
   "\n" +
   "syntax = \"proto2\";\n" +
   "\n" +
   "package hp_monitoring;\n" +
   "\n" +
   "\n" +
   "\n" +
   "message HPCharacter {\n" +
   "   \n" +
   "   optional string id = 1;\n" +
   "   \n" +
   "   optional string name = 2;\n" +
   "   \n" +
   "   optional string bio = 3;\n" +
   "   \n" +
   "   optional CharacterType type = 4;\n" +
   "}\n" +
   "\n" +
   "\n" +
   "message HPMagic {\n" +
   "   \n" +
   "   optional string id = 1;\n" +
   "   \n" +
   "   optional string caster = 2;\n" +
   "   \n" +
   "   optional string spell = 3;\n" +
   "   \n" +
   "   optional bool hogwarts = 4;\n" +
   "}\n" +
   "\n" +
   "\n" +
   "message HPSpell {\n" +
   "   \n" +
   "   optional string id = 1;\n" +
   "   \n" +
   "   optional string name = 2;\n" +
   "   \n" +
   "   optional string type = 3;\n" +
   "   \n" +
   "   optional string description = 4;\n" +
   "}\n" +
   "\n" +
   "\n" +
   "enum CharacterType {\n" +
   "   \n" +
   "   OTHER = 1;\n" +
   "   \n" +
   "   STUDENT = 2;\n" +
   "   \n" +
   "   TEACHER = 3;\n" +
   "   \n" +
   "   MUGGLE = 4;\n" +
   "}\n" +
   "";
   
   @Override
   public String getProtoFileName() { return "MonitoringAppContextInitializer.proto"; }
   
   @Override
   public String getProtoFile() { return PROTO_SCHEMA; }
   
   @Override
   public void registerSchema(org.infinispan.protostream.SerializationContext serCtx) {
      serCtx.registerProtoFiles(org.infinispan.protostream.FileDescriptorSource.fromString(getProtoFileName(), getProtoFile()));
   }
   
   @Override
   public void registerMarshallers(org.infinispan.protostream.SerializationContext serCtx) {
      serCtx.registerMarshaller(new org.infinispan.hp.model.HPCharacter$___Marshaller_2683e4f30511c8bc8c33b2e4b1a27f32774242e981a0987ae328a308451bc574());
      serCtx.registerMarshaller(new org.infinispan.hp.model.HPMagic$___Marshaller_7e319f4b9cf4653f52bcf345a86979a1e75548220a36f9f28594b8a7a3ddf848());
      serCtx.registerMarshaller(new org.infinispan.hp.model.HPSpell$___Marshaller_e093d7ec934766273ab685ccd1b15afb648524fcdd3fe5dfe605882b471ffdde());
      serCtx.registerMarshaller(new org.infinispan.hp.model.CharacterType$___Marshaller_2e634b507cb2378a98422f57da706df880078a226c21b9e22d587c52f7a9e9d8());
   }
}