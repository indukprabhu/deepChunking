/*************************************************/
/* START of File */
#include <x10/io/File.h>


//#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
x10_char x10::io::File::FMGL(SEPARATOR);
void x10::io::File::FMGL(SEPARATOR__do_init)() {
    FMGL(SEPARATOR__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::io::File.SEPARATOR");
    x10_char __var421__ = ((x10_char)'/');
    FMGL(SEPARATOR) = __var421__;
    FMGL(SEPARATOR__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::io::File::FMGL(SEPARATOR__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(SEPARATOR__status), &FMGL(SEPARATOR__do_init), &FMGL(SEPARATOR__exception), "x10::io::File.SEPARATOR");
    
}
volatile ::x10aux::StaticInitController::status x10::io::File::FMGL(SEPARATOR__status);
::x10::lang::CheckedThrowable* x10::io::File::FMGL(SEPARATOR__exception);

//#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
x10_char x10::io::File::FMGL(PATH_SEPARATOR);
void x10::io::File::FMGL(PATH_SEPARATOR__do_init)() {
    FMGL(PATH_SEPARATOR__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::io::File.PATH_SEPARATOR");
    x10_char __var422__ = ((x10_char)':');
    FMGL(PATH_SEPARATOR) = __var422__;
    FMGL(PATH_SEPARATOR__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::io::File::FMGL(PATH_SEPARATOR__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(PATH_SEPARATOR__status), &FMGL(PATH_SEPARATOR__do_init), &FMGL(PATH_SEPARATOR__exception), "x10::io::File.PATH_SEPARATOR");
    
}
volatile ::x10aux::StaticInitController::status x10::io::File::FMGL(PATH_SEPARATOR__status);
::x10::lang::CheckedThrowable* x10::io::File::FMGL(PATH_SEPARATOR__exception);

//#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"

//#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"

//#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"

//#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
void x10::io::File::_constructor(::x10::lang::String* fullName) {
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    ::x10::io::File* this__87057 = this;
    
    //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    x10_int i = ::x10aux::nullCheck(fullName)->x10::lang::String::lastIndexOf(
                  ((x10_char)'/'));
    
    //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    if ((::x10aux::struct_equals(i, ((x10_int)0)))) {
        
        //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        this->FMGL(parent) = (::x10aux::class_cast_unchecked< ::x10::io::File*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        this->FMGL(name) = fullName;
        
        //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        this->FMGL(absolute) = true;
    } else 
    //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    if (((i) >= (((x10_int)0)))) {
        
        //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        this->FMGL(parent) = (__extension__ ({
            ::x10::io::File* alloc__87022 =  (new (::x10aux::alloc_z< ::x10::io::File>()) ::x10::io::File());
            (alloc__87022)->::x10::io::File::_constructor(::x10aux::nullCheck(fullName)->x10::lang::String::substring(
                                                            ((x10_int)0),
                                                            i));
            alloc__87022;
        }))
        ;
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        this->FMGL(name) = ::x10aux::nullCheck(fullName)->x10::lang::String::substring(
                             ((i) + (((x10_int)1))), ::x10aux::nullCheck(fullName)->x10::lang::String::length());
        
        //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        this->FMGL(absolute) = (::x10aux::struct_equals(::x10aux::nullCheck(fullName)->x10::lang::String::charAt(
                                                          ((x10_int)0)),
                                                        ((x10_char)':')));
    } else {
        
        //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        this->FMGL(parent) = (::x10aux::class_cast_unchecked< ::x10::io::File*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        this->FMGL(name) = fullName;
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        this->FMGL(absolute) = false;
    }
    
}
::x10::io::File* x10::io::File::_make(::x10::lang::String* fullName)
{
    ::x10::io::File* this_ = new (::x10aux::alloc_z< ::x10::io::File>()) ::x10::io::File();
    this_->_constructor(fullName);
    return this_;
}



//#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
void x10::io::File::_constructor(::x10::io::File* p, ::x10::lang::String* n) {
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    ::x10::io::File* this__87058 = this;
    
    //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    #ifndef NO_ASSERTIONS
    if (::x10aux::x10__assertions_enabled)
        ::x10aux::x10__assert((!::x10aux::struct_equals(p,
                                                        reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))));
    #endif//NO_ASSERTIONS
    
    //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    this->FMGL(parent) = p;
    
    //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    this->FMGL(name) = n;
    
    //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    this->FMGL(absolute) = ((!::x10aux::struct_equals(p, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))) &&
    ::x10aux::nullCheck(p)->FMGL(absolute));
}
::x10::io::File* x10::io::File::_make(::x10::io::File* p,
                                      ::x10::lang::String* n)
{
    ::x10::io::File* this_ = new (::x10aux::alloc_z< ::x10::io::File>()) ::x10::io::File();
    this_->_constructor(p, n);
    return this_;
}



//#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
::x10::lang::String* x10::io::File::toString() {
    return this->getPath();
    
}

//#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
::x10::io::ReaderIterator< ::x10::lang::String*>* x10::io::File::lines(
  ) {
    
    //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    return ::x10aux::nullCheck(this->openRead())->lines();
    
}

//#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
::x10::io::ReaderIterator<x10_char>* x10::io::File::chars(
  ) {
    
    //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    return ::x10aux::nullCheck(this->openRead())->chars();
    
}

//#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
::x10::io::ReaderIterator<x10_byte>* x10::io::File::bytes(
  ) {
    
    //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    return ::x10aux::nullCheck(this->openRead())->bytes();
    
}

//#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
::x10::io::FileReader* x10::io::File::openRead() {
    
    //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    ::x10::io::FileReader* alloc__87059 =  (new (::x10aux::alloc_z< ::x10::io::FileReader>()) ::x10::io::FileReader());
    (alloc__87059)->::x10::io::FileReader::_constructor(this);
    return alloc__87059;
    
}

//#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
::x10::io::FileWriter* x10::io::File::openWrite() {
    return this->openWrite(false);
    
}

//#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
::x10::io::FileWriter* x10::io::File::openWrite(x10_boolean append) {
    
    //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    ::x10::io::FileWriter* alloc__87060 =  (new (::x10aux::alloc_z< ::x10::io::FileWriter>()) ::x10::io::FileWriter());
    (alloc__87060)->::x10::io::FileWriter::_constructor(this,
                                                        append);
    return alloc__87060;
    
}

//#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
::x10::io::Printer* x10::io::File::printer() {
    return this->printer(false);
    
}

//#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
::x10::io::Printer* x10::io::File::printer(x10_boolean append) {
    
    //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    ::x10::io::Printer* alloc__87061 =  (new (::x10aux::alloc_z< ::x10::io::Printer>()) ::x10::io::Printer());
    (alloc__87061)->::x10::io::Printer::_constructor(reinterpret_cast< ::x10::io::Writer*>(this->openWrite(
                                                                                             append)));
    return alloc__87061;
    
}

//#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
::x10::lang::String* x10::io::File::getName() {
    return this->FMGL(name);
    
}

//#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
::x10::io::File* x10::io::File::getParentFile() {
    return this->FMGL(parent);
    
}

//#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
::x10::lang::String* x10::io::File::getPath() {
    return (::x10aux::struct_equals(this->FMGL(parent), reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))
      ? (this->FMGL(name)) : (::x10::lang::String::__plus(::x10::lang::String::__plus(::x10aux::nullCheck(this->FMGL(parent))->getPath(), ((x10_char)'/')), this->FMGL(name)));
    
}

//#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
x10_boolean x10::io::File::isAbsolute() {
    return this->FMGL(absolute);
    
}

//#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
::x10::io::File__NativeFile* x10::io::File::nativeFile() {
    return ::x10::io::File__NativeFile::_make(this->getPath());
    
}

//#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
::x10::io::File* x10::io::File::getAbsoluteFile() {
    ::x10::io::File* alloc__87062 =  (new (::x10aux::alloc_z< ::x10::io::File>()) ::x10::io::File());
    (alloc__87062)->::x10::io::File::_constructor(this->nativeFile()->x10::io::File__NativeFile::getAbsolutePath());
    return alloc__87062;
    
}

//#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
::x10::io::File* x10::io::File::getCanonicalFile() {
    
    //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    ::x10::io::File* alloc__87063 =  (new (::x10aux::alloc_z< ::x10::io::File>()) ::x10::io::File());
    (alloc__87063)->::x10::io::File::_constructor(this->nativeFile()->x10::io::File__NativeFile::getCanonicalPath());
    return alloc__87063;
    
}

//#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
x10_boolean x10::io::File::exists() {
    return this->nativeFile()->x10::io::File__NativeFile::exists();
    
}

//#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
x10_boolean x10::io::File::isSymbolicLink() {
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make()));
}

//#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
x10_boolean x10::io::File::isAlias() {
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make()));
}

//#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
x10_boolean x10::io::File::hardLinkCount() {
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make()));
}

//#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
x10_long x10::io::File::inodeNumber() {
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make()));
}

//#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
x10_int x10::io::File::permissions() {
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make()));
}

//#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
x10_boolean x10::io::File::isDirectory() {
    return this->nativeFile()->x10::io::File__NativeFile::isDirectory();
    
}

//#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
x10_boolean x10::io::File::isFile() {
    return this->nativeFile()->x10::io::File__NativeFile::isFile();
    
}

//#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
x10_boolean x10::io::File::isHidden() {
    return this->nativeFile()->x10::io::File__NativeFile::isHidden();
    
}

//#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
x10_long x10::io::File::lastModified() {
    return this->nativeFile()->x10::io::File__NativeFile::lastModified();
    
}

//#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
x10_boolean x10::io::File::setLastModified(x10_long t) {
    return this->nativeFile()->x10::io::File__NativeFile::setLastModified(
             t);
    
}

//#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
x10_long x10::io::File::size() {
    return this->nativeFile()->x10::io::File__NativeFile::length();
    
}

//#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
x10_int x10::io::File::compareTo(::x10::io::File* f) {
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make()));
}

//#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
x10_boolean x10::io::File::canRead() {
    return this->nativeFile()->x10::io::File__NativeFile::canRead();
    
}

//#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
x10_boolean x10::io::File::canWrite() {
    return this->nativeFile()->x10::io::File__NativeFile::canWrite();
    
}

//#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
x10_boolean x10::io::File::_kwd__delete() {
    return (this->nativeFile())->del();
    
}

//#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
::x10::lang::Rail< ::x10::lang::String* >* x10::io::File::list(
  ) {
    return this->nativeFile()->x10::io::File__NativeFile::list();
    
}

//#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
x10_boolean x10::io::File::mkdir() {
    return this->nativeFile()->x10::io::File__NativeFile::mkdir();
    
}

//#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
x10_boolean x10::io::File::mkdirs() {
    return this->nativeFile()->x10::io::File__NativeFile::mkdirs();
    
}

//#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
x10_boolean x10::io::File::renameTo(::x10::io::File* dest) {
    return this->nativeFile()->x10::io::File__NativeFile::renameTo(
             ::x10aux::nullCheck(dest)->nativeFile());
    
}

//#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
::x10::io::File* x10::io::File::x10__io__File____this__x10__io__File(
  ) {
    return this;
    
}
void x10::io::File::__fieldInitializers_x10_io_File() {
 
}
const ::x10aux::serialization_id_t x10::io::File::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::io::File::_deserializer);

void x10::io::File::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(parent));
    buf.write(this->FMGL(name));
    buf.write(this->FMGL(absolute));
    
}

::x10::lang::Reference* ::x10::io::File::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::io::File* this_ = new (::x10aux::alloc_z< ::x10::io::File>()) ::x10::io::File();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::io::File::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(parent) = buf.read< ::x10::io::File*>();
    FMGL(name) = buf.read< ::x10::lang::String*>();
    FMGL(absolute) = buf.read<x10_boolean>();
}

::x10aux::RuntimeType x10::io::File::rtt;
void x10::io::File::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.io.File",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of File */
/*************************************************/
