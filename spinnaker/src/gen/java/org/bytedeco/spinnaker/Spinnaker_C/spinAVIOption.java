// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.spinnaker.Spinnaker_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.spinnaker.global.Spinnaker_C.*;


/**
 * Options for saving uncompressed videos. Used in saving AVI videos
 * with a call to spinAVIRecorderOpenUncompressed().
 */
@Properties(inherit = org.bytedeco.spinnaker.presets.Spinnaker_C.class)
public class spinAVIOption extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public spinAVIOption() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public spinAVIOption(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public spinAVIOption(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public spinAVIOption position(long position) {
        return (spinAVIOption)super.position(position);
    }
    @Override public spinAVIOption getPointer(long i) {
        return new spinAVIOption((Pointer)this).offsetAddress(i);
    }

    /** Frame rate of the stream */
    public native float frameRate(); public native spinAVIOption frameRate(float setter);

    /** Reserved for future use */
    public native @Cast("unsigned int") int reserved(int i); public native spinAVIOption reserved(int i, int setter);
    @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();
    /*
    _spinAVIOption()
    {
        frameRate = 15.0;
        memset(reserved, 0, sizeof(reserved));
    }*/
}
