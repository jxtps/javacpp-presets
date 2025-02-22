// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Update '*var' according to the adadelta scheme.
 * 
 *  accum = rho() * accum + (1 - rho()) * grad.square();
 *  update = (update_accum + epsilon).sqrt() * (accum + epsilon()).rsqrt() * grad;
 *  update_accum = rho() * update_accum + (1 - rho()) * update.square();
 *  var -= update;
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * var: Should be from a Variable().
 *  * accum: Should be from a Variable().
 *  * accum_update: Should be from a Variable().
 *  * lr: Scaling factor. Must be a scalar.
 *  * rho: Decay factor. Must be a scalar.
 *  * epsilon: Constant factor. Must be a scalar.
 *  * grad: The gradient.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * use_locking: If True, updating of the var, accum and update_accum tensors will be protected by
 *  a lock; otherwise the behavior is undefined, but may exhibit less contention.
 * 
 *  Returns:
 *  * the created {@code Operation} */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ResourceApplyAdadelta extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ResourceApplyAdadelta(Pointer p) { super(p); }

  /** Optional attribute setters for ResourceApplyAdadelta */
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
  
    /** If True, updating of the var, accum and update_accum tensors will be protected by
     *  a lock; otherwise the behavior is undefined, but may exhibit less contention.
     * 
     *  Defaults to false */
    public native @ByVal Attrs UseLocking(@Cast("bool") boolean x);

    public native @Cast("bool") boolean use_locking_(); public native Attrs use_locking_(boolean setter);
  }
  public ResourceApplyAdadelta(@Const @ByRef Scope scope, @ByVal Input var, @ByVal Input accum, @ByVal Input accum_update, @ByVal Input lr, @ByVal Input rho, @ByVal Input epsilon, @ByVal Input grad) { super((Pointer)null); allocate(scope, var, accum, accum_update, lr, rho, epsilon, grad); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input var, @ByVal Input accum, @ByVal Input accum_update, @ByVal Input lr, @ByVal Input rho, @ByVal Input epsilon, @ByVal Input grad);
  public ResourceApplyAdadelta(@Const @ByRef Scope scope, @ByVal Input var, @ByVal Input accum, @ByVal Input accum_update, @ByVal Input lr, @ByVal Input rho, @ByVal Input epsilon, @ByVal Input grad, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, var, accum, accum_update, lr, rho, epsilon, grad, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input var, @ByVal Input accum, @ByVal Input accum_update, @ByVal Input lr, @ByVal Input rho, @ByVal Input epsilon, @ByVal Input grad, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Operation") Operation asOperation();

  public static native @ByVal Attrs UseLocking(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native ResourceApplyAdadelta operation(Operation setter);
}
