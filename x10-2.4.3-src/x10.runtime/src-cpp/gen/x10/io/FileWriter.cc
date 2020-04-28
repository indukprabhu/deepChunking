/*************************************************/
/* START of FileWriter */
#include <x10/io/FileWriter.h>

#include <x10/io/OutputStreamWriter.h>
#include <x10/io/Unserializable.h>
#include <x10/io/File.h>
#include <x10/lang/String.h>
#include <x10/lang/Boolean.h>
#include <x10/io/OutputStreamWriter__OutputStream.h>
#include <x10/io/FileWriter__FileOutputStream.h>
#include <x10/compiler/Synthetic.h>
::x10::io::Unserializable::itable< ::x10::io::FileWriter >  x10::io::FileWriter::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::io::FileWriter >  x10::io::FileWriter::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::io::FileWriter::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::Unserializable>, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::io::FileWriter")};

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileWriter.x10"

//#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileWriter.x10"
::x10::io::OutputStreamWriter__OutputStream* x10::io::FileWriter::make(::x10::lang::String* path,
                                                                       x10_boolean append) {
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileWriter.x10"
    return ::x10::io::FileWriter__FileOutputStream::_make(path, append);
    
}

//#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileWriter.x10"
void x10::io::FileWriter::_constructor(::x10::io::File* file) {
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileWriter.x10"
    (this)->::x10::io::FileWriter::_constructor(file, false);
    
}
::x10::io::FileWriter* x10::io::FileWriter::_make(::x10::io::File* file)
{
    ::x10::io::FileWriter* this_ = new (::x10aux::alloc_z< ::x10::io::FileWriter>()) ::x10::io::FileWriter();
    this_->_constructor(file);
    return this_;
}



//#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileWriter.x10"
void x10::io::FileWriter::_constructor(::x10::io::File* file, x10_boolean append) {
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileWriter.x10"
    (this)->::x10::io::OutputStreamWriter::_constructor((__extension__ ({
                                                            
                                                            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileWriter.x10"
                                                            ::x10::lang::String* path__87045 =
                                                              ::x10aux::nullCheck(file)->getPath();
                                                            x10_boolean append__87046 =
                                                              append;
                                                            reinterpret_cast< ::x10::io::OutputStreamWriter__OutputStream*>(::x10::io::FileWriter__FileOutputStream::_make(path__87045,
                                                                                                                                                                           append__87046));
                                                        }))
                                                        );
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileWriter.x10"
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileWriter.x10"
    ::x10::io::FileWriter* this__87050 = this;
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileWriter.x10"
    this->FMGL(file) = file;
}
::x10::io::FileWriter* x10::io::FileWriter::_make(::x10::io::File* file,
                                                  x10_boolean append)
{
    ::x10::io::FileWriter* this_ = new (::x10aux::alloc_z< ::x10::io::FileWriter>()) ::x10::io::FileWriter();
    this_->_constructor(file, append);
    return this_;
}



//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileWriter.x10"
::x10::io::FileWriter* x10::io::FileWriter::x10__io__FileWriter____this__x10__io__FileWriter(
  ) {
    return this;
    
}
void x10::io::FileWriter::__fieldInitializers_x10_io_FileWriter(
  ) {
 
}
::x10aux::RuntimeType x10::io::FileWriter::rtt;
void x10::io::FileWriter::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::io::OutputStreamWriter>(), ::x10aux::getRTT< ::x10::io::Unserializable>()};
    rtt.initStageTwo("x10.io.FileWriter",::x10aux::RuntimeType::class_kind, 2, parents, 0, NULL, NULL);
}

/* END of FileWriter */
/*************************************************/
