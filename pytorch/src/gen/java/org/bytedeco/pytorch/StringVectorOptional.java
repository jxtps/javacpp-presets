// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

@NoOffset @Name("c10::optional<std::vector<std::string> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class StringVectorOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringVectorOptional(Pointer p) { super(p); }
    public StringVectorOptional(StringVector value) { this(); put(value); }
    public StringVectorOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef StringVectorOptional put(@ByRef StringVectorOptional x);


    public native boolean has_value();
    @Name("value") public native @ByRef StringVector get();
    @ValueSetter public native StringVectorOptional put(@ByRef StringVector value);
}

