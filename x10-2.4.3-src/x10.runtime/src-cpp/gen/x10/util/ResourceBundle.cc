/*************************************************/
/* START of ResourceBundle */
#include <x10/util/ResourceBundle.h>


//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
::x10::util::HashMap< ::x10::lang::String*, ::x10::util::ResourceBundle*>*
  x10::util::ResourceBundle::FMGL(cache);
void x10::util::ResourceBundle::FMGL(cache__do_init)() {
    FMGL(cache__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::ResourceBundle.cache");
    ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::ResourceBundle*>* __var2903__ = ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::ResourceBundle*>::_make();
    FMGL(cache) = __var2903__;
    FMGL(cache__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::ResourceBundle::FMGL(cache__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(cache__status), &FMGL(cache__do_init), &FMGL(cache__exception), "x10::util::ResourceBundle.cache");
    
}
volatile ::x10aux::StaticInitController::status x10::util::ResourceBundle::FMGL(cache__status);
::x10::lang::CheckedThrowable* x10::util::ResourceBundle::FMGL(cache__exception);

//#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"

//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"

//#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
void x10::util::ResourceBundle::_constructor(::x10::lang::String* baseName) {
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
    this->x10::util::ResourceBundle::__fieldInitializers_x10_util_ResourceBundle();
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
    this->FMGL(baseName) = baseName;
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
    ::x10::io::Reader* reader = ::x10aux::class_cast_unchecked< ::x10::io::Reader*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
    try {
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
        reader = (__extension__ ({
                     ::x10::io::File* alloc__122100 =  (new (::x10aux::alloc_z< ::x10::io::File>()) ::x10::io::File());
                     (alloc__122100)->::x10::io::File::_constructor(::x10::lang::String::__plus(baseName, (__extension__ ({ static ::x10::lang::String* strLit__129989 = ::x10aux::makeStringLit(".properties"); strLit__129989; }))));
                     alloc__122100;
                 }))
                 ->openRead();
    }
    catch (::x10::lang::CheckedThrowable* __exc2904) {
        if (::x10aux::instanceof< ::x10::io::IOException*>(__exc2904)) {
            ::x10::io::IOException* e = static_cast< ::x10::io::IOException*>(__exc2904);
            {
                
                //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
                ::x10aux::throwException(::x10aux::nullCheck(::x10::util::MissingResourceException::_make(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129990 = ::x10aux::makeStringLit("Can\'t find bundle for base name "); strLit__129990; })), baseName),
                                                                                                          baseName,
                                                                                                          ::x10aux::class_cast_unchecked< ::x10::lang::String*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))));
            }
        } else
        throw;
    }
    {
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
        ::x10::lang::CheckedThrowable* throwable__122102 =
          ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        try {
            try {
                
                //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
                while (true) {
                    
                    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
                    ::x10::lang::String* s = ::x10aux::nullCheck(reader)->readLine();
                    
                    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
                    x10_int delim = ::x10aux::nullCheck(s)->x10::lang::String::indexOf(
                                      ((x10_char)'='));
                    
                    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
                    ::x10::lang::String* key = ::x10aux::nullCheck(s)->x10::lang::String::substring(
                                                 ((x10_int)0),
                                                 delim);
                    
                    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
                    ::x10::lang::String* value = ::x10aux::nullCheck(s)->x10::lang::String::substring(
                                                   ((delim) + (((x10_int)1))));
                    
                    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
                    this->FMGL(props)->put(key, value);
                }
                
            }
            catch (::x10::lang::CheckedThrowable* __exc2905) {
                if (::x10aux::instanceof< ::x10::io::EOFException*>(__exc2905)) {
                    ::x10::io::EOFException* e = static_cast< ::x10::io::EOFException*>(__exc2905);
                    {
                     
                    }
                } else
                if (true) {
                    ::x10::lang::CheckedThrowable* e = static_cast< ::x10::lang::CheckedThrowable*>(__exc2905);
                    {
                        
                        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
                        ::x10aux::throwException(::x10aux::nullCheck(::x10::util::MissingResourceException::_make(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129993 = ::x10aux::makeStringLit("Error in loading bundle "); strLit__129993; })), baseName),
                                                                                                                  baseName,
                                                                                                                  ::x10aux::class_cast_unchecked< ::x10::lang::String*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)),
                                                                                                                  e)));
                    }
                } else
                throw;
            }
            ::x10::compiler::Finalization::plausibleThrow();
        }
        catch (::x10::lang::CheckedThrowable* __exc2906) {
            if (true) {
                ::x10::lang::CheckedThrowable* formal__122103 =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc2906);
                {
                    throwable__122102 = formal__122103;
                }
            } else
            throw;
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__122102)))
        {
            if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122102))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__122102));
            }
            
        }
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
        if (true) {
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
            ::x10aux::nullCheck(reader)->close();
        }
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__122102)))
        {
            if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122102)))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__122102));
            }
            
        }
        
    }
}
::x10::util::ResourceBundle* x10::util::ResourceBundle::_make(
  ::x10::lang::String* baseName) {
    ::x10::util::ResourceBundle* this_ = new (::x10aux::alloc_z< ::x10::util::ResourceBundle>()) ::x10::util::ResourceBundle();
    this_->_constructor(baseName);
    return this_;
}



//#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
::x10::util::ResourceBundle* x10::util::ResourceBundle::getBundle(
  ::x10::lang::String* baseName) {
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
    ::x10::util::ResourceBundle* bundle = ::x10aux::class_cast_unchecked< ::x10::util::ResourceBundle*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
    {
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
        ::x10::lang::CheckedThrowable* throwable__122105 =
          ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        try {
            {
                ::x10::lang::Runtime::enterAtomic();
                {
                    
                    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
                    bundle = ::x10::util::ResourceBundle::FMGL(cache__get)()->getOrElse(
                               baseName, ::x10aux::class_cast_unchecked< ::x10::util::ResourceBundle*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                    
                    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
                    if ((::x10aux::struct_equals(bundle, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
                    {
                        
                        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
                        bundle = ::x10::util::ResourceBundle::_make(baseName);
                        
                        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
                        ::x10::util::ResourceBundle::FMGL(cache__get)()->put(
                          baseName, bundle);
                    }
                    
                }
            }
            ::x10::compiler::Finalization::plausibleThrow();
        }
        catch (::x10::lang::CheckedThrowable* __exc2908) {
            if (true) {
                ::x10::lang::CheckedThrowable* formal__122106 =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc2908);
                {
                    throwable__122105 = formal__122106;
                }
            } else
            throw;
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__122105)))
        {
            if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122105))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__122105));
            }
            
        }
        if (true) {
            ::x10::lang::Runtime::exitAtomic();
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__122105)))
        {
            if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122105)))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__122105));
            }
            
        }
        
    }
    
    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
    return bundle;
    
}

//#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
::x10::util::ResourceBundle* x10::util::ResourceBundle::getBundle(
  ::x10::lang::String* baseName, ::x10::lang::Any* loaderOrLoaded) {
    
    //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
    return ::x10::util::ResourceBundle::getBundle(baseName);
    
}

//#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
x10_boolean x10::util::ResourceBundle::containsKey(::x10::lang::String* key) {
    
    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
    return this->FMGL(props)->containsKey(key);
    
}

//#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
::x10::lang::String* x10::util::ResourceBundle::getString(
  ::x10::lang::String* key) {
    
    //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
    ::x10::lang::String* value = this->FMGL(props)->getOrElse(
                                   key, ::x10aux::class_cast_unchecked< ::x10::lang::String*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
    if ((!::x10aux::struct_equals(value, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        return value;
        
    }
    
    //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::util::MissingResourceException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__130001 = ::x10aux::makeStringLit("Can\'t find resource for bundle "); strLit__130001; })), this->FMGL(baseName)), (__extension__ ({ static ::x10::lang::String* strLit__130002 = ::x10aux::makeStringLit(", key "); strLit__130002; }))), key),
                                                                                              this->FMGL(baseName),
                                                                                              key)));
}

//#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
::x10::util::Set< ::x10::lang::String*>* x10::util::ResourceBundle::keySet(
  ) {
    
    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
    return this->FMGL(props)->keySet();
    
}

//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
::x10::util::ResourceBundle* x10::util::ResourceBundle::x10__util__ResourceBundle____this__x10__util__ResourceBundle(
  ) {
    return this;
    
}
void x10::util::ResourceBundle::__fieldInitializers_x10_util_ResourceBundle(
  ) {
    this->FMGL(props) = (__extension__ ({
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ResourceBundle.x10"
        ::x10::util::HashMap< ::x10::lang::String*, ::x10::lang::String*>* alloc__122101 =
           (new (::x10aux::alloc_z< ::x10::util::HashMap< ::x10::lang::String*, ::x10::lang::String*> >()) ::x10::util::HashMap< ::x10::lang::String*, ::x10::lang::String*>());
        (alloc__122101)->::x10::util::HashMap< ::x10::lang::String*, ::x10::lang::String*>::_constructor();
        alloc__122101;
    }))
    ;
}
const ::x10aux::serialization_id_t x10::util::ResourceBundle::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::util::ResourceBundle::_deserializer);

void x10::util::ResourceBundle::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(props));
    buf.write(this->FMGL(baseName));
    
}

::x10::lang::Reference* ::x10::util::ResourceBundle::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::util::ResourceBundle* this_ = new (::x10aux::alloc_z< ::x10::util::ResourceBundle>()) ::x10::util::ResourceBundle();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::util::ResourceBundle::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(props) = buf.read< ::x10::util::HashMap< ::x10::lang::String*, ::x10::lang::String*>*>();
    FMGL(baseName) = buf.read< ::x10::lang::String*>();
}

::x10aux::RuntimeType x10::util::ResourceBundle::rtt;
void x10::util::ResourceBundle::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.util.ResourceBundle",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of ResourceBundle */
/*************************************************/
