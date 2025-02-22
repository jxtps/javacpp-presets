// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Extract {@code patches} from {@code images} and put them in the "depth" output dimension.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * images: 4-D Tensor with shape {@code [batch, in_rows, in_cols, depth]}.
 *  * ksizes: The size of the sliding window for each dimension of {@code images}.
 *  * strides: How far the centers of two consecutive patches are in
 *  the images. Must be: {@code [1, stride_rows, stride_cols, 1]}.
 *  * rates: Must be: {@code [1, rate_rows, rate_cols, 1]}. This is the
 *  input stride, specifying how far two consecutive patch samples are in the
 *  input. Equivalent to extracting patches with
 *  {@code patch_sizes_eff = patch_sizes + (patch_sizes - 1) * (rates - 1)}, followed by
 *  subsampling them spatially by a factor of {@code rates}. This is equivalent to
 *  {@code rate} in dilated (a.k.a. Atrous) convolutions.
 *  * padding: The type of padding algorithm to use.
 * 
 *  Returns:
 *  * {@code Output}: 4-D Tensor with shape {@code [batch, out_rows, out_cols, ksize_rows *
 *  ksize_cols * depth]} containing image patches with size
 *  {@code ksize_rows x ksize_cols x depth} vectorized in the "depth" dimension. Note
 *  {@code out_rows} and {@code out_cols} are the dimensions of the output patches. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ExtractImagePatches extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ExtractImagePatches(Pointer p) { super(p); }

  public ExtractImagePatches(@Const @ByRef Scope scope, @ByVal Input images, @ArraySlice IntPointer ksizes, @ArraySlice IntPointer strides, @ArraySlice IntPointer rates, @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, images, ksizes, strides, rates, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input images, @ArraySlice IntPointer ksizes, @ArraySlice IntPointer strides, @ArraySlice IntPointer rates, @StringPiece BytePointer padding);
  public ExtractImagePatches(@Const @ByRef Scope scope, @ByVal Input images, @ArraySlice IntBuffer ksizes, @ArraySlice IntBuffer strides, @ArraySlice IntBuffer rates, @StringPiece String padding) { super((Pointer)null); allocate(scope, images, ksizes, strides, rates, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input images, @ArraySlice IntBuffer ksizes, @ArraySlice IntBuffer strides, @ArraySlice IntBuffer rates, @StringPiece String padding);
  public ExtractImagePatches(@Const @ByRef Scope scope, @ByVal Input images, @ArraySlice int[] ksizes, @ArraySlice int[] strides, @ArraySlice int[] rates, @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, images, ksizes, strides, rates, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input images, @ArraySlice int[] ksizes, @ArraySlice int[] strides, @ArraySlice int[] rates, @StringPiece BytePointer padding);
  public ExtractImagePatches(@Const @ByRef Scope scope, @ByVal Input images, @ArraySlice IntPointer ksizes, @ArraySlice IntPointer strides, @ArraySlice IntPointer rates, @StringPiece String padding) { super((Pointer)null); allocate(scope, images, ksizes, strides, rates, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input images, @ArraySlice IntPointer ksizes, @ArraySlice IntPointer strides, @ArraySlice IntPointer rates, @StringPiece String padding);
  public ExtractImagePatches(@Const @ByRef Scope scope, @ByVal Input images, @ArraySlice IntBuffer ksizes, @ArraySlice IntBuffer strides, @ArraySlice IntBuffer rates, @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, images, ksizes, strides, rates, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input images, @ArraySlice IntBuffer ksizes, @ArraySlice IntBuffer strides, @ArraySlice IntBuffer rates, @StringPiece BytePointer padding);
  public ExtractImagePatches(@Const @ByRef Scope scope, @ByVal Input images, @ArraySlice int[] ksizes, @ArraySlice int[] strides, @ArraySlice int[] rates, @StringPiece String padding) { super((Pointer)null); allocate(scope, images, ksizes, strides, rates, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input images, @ArraySlice int[] ksizes, @ArraySlice int[] strides, @ArraySlice int[] rates, @StringPiece String padding);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native ExtractImagePatches operation(Operation setter);
  public native @ByRef Output patches(); public native ExtractImagePatches patches(Output setter);
}
