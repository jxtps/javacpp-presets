// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Creates a tensor with the given shape.
 * 
 *  This operation creates a tensor of {@code shape} and {@code dtype}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * shape: 1-D. Represents the shape of the output tensor.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * init: If True, initialize the returned tensor with the default value of dtype.  Otherwise, the implementation is free not to initializethe tensor's content.
 * 
 *  Returns:
 *  * {@code Output}: A {@code Tensor} of type {@code T}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Empty extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Empty(Pointer p) { super(p); }

  /** Optional attribute setters for Empty */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
      @Override public Attrs getPointer(long i) {
          return new Attrs((Pointer)this).offsetAddress(i);
      }
  
    /** If True, initialize the returned tensor with the default value of dtype.  Otherwise, the implementation is free not to initializethe tensor's content.
     * 
     *  Defaults to false */
    public native @ByVal Attrs Init(@Cast("bool") boolean x);

    public native @Cast("bool") boolean init_(); public native Attrs init_(boolean setter);
  }
  public Empty(@Const @ByRef Scope scope, @ByVal Input shape, @Cast("tensorflow::DataType") int dtype) { super((Pointer)null); allocate(scope, shape, dtype); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input shape, @Cast("tensorflow::DataType") int dtype);
  public Empty(@Const @ByRef Scope scope, @ByVal Input shape, @Cast("tensorflow::DataType") int dtype, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, shape, dtype, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input shape, @Cast("tensorflow::DataType") int dtype, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Init(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native Empty operation(Operation setter);
  public native @ByRef Output output(); public native Empty output(Output setter);
}
