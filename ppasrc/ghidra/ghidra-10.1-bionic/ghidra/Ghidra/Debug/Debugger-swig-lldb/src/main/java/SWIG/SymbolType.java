/* ###
 * IP: Apache License 2.0 with LLVM Exceptions
 */
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package SWIG;

public final class SymbolType {
  public final static SymbolType eSymbolTypeAny = new SymbolType("eSymbolTypeAny", lldbJNI.eSymbolTypeAny_get());
  public final static SymbolType eSymbolTypeInvalid = new SymbolType("eSymbolTypeInvalid", lldbJNI.eSymbolTypeInvalid_get());
  public final static SymbolType eSymbolTypeAbsolute = new SymbolType("eSymbolTypeAbsolute");
  public final static SymbolType eSymbolTypeCode = new SymbolType("eSymbolTypeCode");
  public final static SymbolType eSymbolTypeResolver = new SymbolType("eSymbolTypeResolver");
  public final static SymbolType eSymbolTypeData = new SymbolType("eSymbolTypeData");
  public final static SymbolType eSymbolTypeTrampoline = new SymbolType("eSymbolTypeTrampoline");
  public final static SymbolType eSymbolTypeRuntime = new SymbolType("eSymbolTypeRuntime");
  public final static SymbolType eSymbolTypeException = new SymbolType("eSymbolTypeException");
  public final static SymbolType eSymbolTypeSourceFile = new SymbolType("eSymbolTypeSourceFile");
  public final static SymbolType eSymbolTypeHeaderFile = new SymbolType("eSymbolTypeHeaderFile");
  public final static SymbolType eSymbolTypeObjectFile = new SymbolType("eSymbolTypeObjectFile");
  public final static SymbolType eSymbolTypeCommonBlock = new SymbolType("eSymbolTypeCommonBlock");
  public final static SymbolType eSymbolTypeBlock = new SymbolType("eSymbolTypeBlock");
  public final static SymbolType eSymbolTypeLocal = new SymbolType("eSymbolTypeLocal");
  public final static SymbolType eSymbolTypeParam = new SymbolType("eSymbolTypeParam");
  public final static SymbolType eSymbolTypeVariable = new SymbolType("eSymbolTypeVariable");
  public final static SymbolType eSymbolTypeVariableType = new SymbolType("eSymbolTypeVariableType");
  public final static SymbolType eSymbolTypeLineEntry = new SymbolType("eSymbolTypeLineEntry");
  public final static SymbolType eSymbolTypeLineHeader = new SymbolType("eSymbolTypeLineHeader");
  public final static SymbolType eSymbolTypeScopeBegin = new SymbolType("eSymbolTypeScopeBegin");
  public final static SymbolType eSymbolTypeScopeEnd = new SymbolType("eSymbolTypeScopeEnd");
  public final static SymbolType eSymbolTypeAdditional = new SymbolType("eSymbolTypeAdditional");
  public final static SymbolType eSymbolTypeCompiler = new SymbolType("eSymbolTypeCompiler");
  public final static SymbolType eSymbolTypeInstrumentation = new SymbolType("eSymbolTypeInstrumentation");
  public final static SymbolType eSymbolTypeUndefined = new SymbolType("eSymbolTypeUndefined");
  public final static SymbolType eSymbolTypeObjCClass = new SymbolType("eSymbolTypeObjCClass");
  public final static SymbolType eSymbolTypeObjCMetaClass = new SymbolType("eSymbolTypeObjCMetaClass");
  public final static SymbolType eSymbolTypeObjCIVar = new SymbolType("eSymbolTypeObjCIVar");
  public final static SymbolType eSymbolTypeReExported = new SymbolType("eSymbolTypeReExported");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static SymbolType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + SymbolType.class + " with value " + swigValue);
  }

  private SymbolType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private SymbolType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private SymbolType(String swigName, SymbolType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static SymbolType[] swigValues = { eSymbolTypeAny, eSymbolTypeInvalid, eSymbolTypeAbsolute, eSymbolTypeCode, eSymbolTypeResolver, eSymbolTypeData, eSymbolTypeTrampoline, eSymbolTypeRuntime, eSymbolTypeException, eSymbolTypeSourceFile, eSymbolTypeHeaderFile, eSymbolTypeObjectFile, eSymbolTypeCommonBlock, eSymbolTypeBlock, eSymbolTypeLocal, eSymbolTypeParam, eSymbolTypeVariable, eSymbolTypeVariableType, eSymbolTypeLineEntry, eSymbolTypeLineHeader, eSymbolTypeScopeBegin, eSymbolTypeScopeEnd, eSymbolTypeAdditional, eSymbolTypeCompiler, eSymbolTypeInstrumentation, eSymbolTypeUndefined, eSymbolTypeObjCClass, eSymbolTypeObjCMetaClass, eSymbolTypeObjCIVar, eSymbolTypeReExported };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

