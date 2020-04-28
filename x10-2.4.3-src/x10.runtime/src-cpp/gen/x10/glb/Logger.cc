/*************************************************/
/* START of Logger */
#include <x10/glb/Logger.h>

#include <x10/lang/Long.h>
#include <x10/lang/Boolean.h>
#include <x10/util/Team.h>
#include <x10/util/Timer.h>
#include <x10/lang/Rail.h>
#include <x10/io/Printer.h>
#include <x10/io/Console.h>
#include <x10/lang/Any.h>
#include <x10/lang/String.h>
#include <x10/lang/Int.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Double.h>
#include <x10/compiler/Synthetic.h>

//#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"

//#line 10 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"

//#line 11 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"

//#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"

//#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"

//#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"

//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"

//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"

//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"

//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"

//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"

//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"

//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"

//#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"

//#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"

//#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
void x10::glb::Logger::_constructor(x10_boolean b) {
    
    //#line 6 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    this->x10::glb::Logger::__fieldInitializers_x10_glb_Logger();
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    if (b) {
        ::x10::util::Team::FMGL(WORLD__get)()->x10::util::Team::barrier();
    }
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    this->FMGL(timeReference) = ::x10::lang::RuntimeNatives::nanoTime();
}
::x10::glb::Logger* x10::glb::Logger::_make(x10_boolean b) {
    ::x10::glb::Logger* this_ = new (::x10aux::alloc_z< ::x10::glb::Logger>()) ::x10::glb::Logger();
    this_->_constructor(b);
    return this_;
}



//#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
void x10::glb::Logger::startLive() {
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    x10_long time = ::x10::lang::RuntimeNatives::nanoTime();
    
    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    if ((::x10aux::struct_equals(this->FMGL(startTime), ((x10_long)0ll))))
    {
        this->FMGL(startTime) = time;
    }
    
    //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    if (((this->FMGL(lastStartStopLiveTimeStamp)) >= (((x10_long)0ll)))) {
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        this->FMGL(timeDead) = ((this->FMGL(timeDead)) + (((time) - (this->FMGL(lastStartStopLiveTimeStamp)))));
    }
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    this->FMGL(lastStartStopLiveTimeStamp) = time;
}

//#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
void x10::glb::Logger::stopLive() {
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    x10_long time = ::x10::lang::RuntimeNatives::nanoTime();
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    this->FMGL(timeAlive) = ((this->FMGL(timeAlive)) + (((time) - (this->FMGL(lastStartStopLiveTimeStamp)))));
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    this->FMGL(lastStartStopLiveTimeStamp) = time;
}

//#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
void x10::glb::Logger::collect(::x10::lang::Rail< ::x10::glb::Logger* >* logs) {
    
    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    ::x10::lang::Rail< ::x10::glb::Logger* >* rail__86461 = logs;
    x10_long size__86462 = (x10_long)(::x10aux::nullCheck(rail__86461)->FMGL(size));
    {
        x10_long idx__86463;
        for (idx__86463 = ((x10_long)0ll); ((idx__86463) < (size__86462));
             idx__86463 = ((idx__86463) + (((x10_long)1ll)))) {
            ::x10::glb::Logger* l__86464 = ::x10aux::nullCheck(rail__86461)->x10::lang::Rail< ::x10::glb::Logger* >::__apply(
                                             idx__86463);
            this->x10::glb::Logger::add(l__86464);
        }
    }
    
}

//#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
void x10::glb::Logger::stats() {
    
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
      reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(this->FMGL(nodesGiven), (__extension__ ({ static ::x10::lang::String* strLit__123569 = ::x10aux::makeStringLit(" Task items stolen = "); strLit__123569; }))), this->FMGL(nodesReceived)), (__extension__ ({ static ::x10::lang::String* strLit__123570 = ::x10aux::makeStringLit(" (direct) + "); strLit__123570; }))), this->FMGL(lifelineNodesReceived)), (__extension__ ({ static ::x10::lang::String* strLit__123571 = ::x10aux::makeStringLit(" (lifeline)."); strLit__123571; })))));
    
    //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
      reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(this->FMGL(stealsPerpetrated), (__extension__ ({ static ::x10::lang::String* strLit__123572 = ::x10aux::makeStringLit(" successful direct steals."); strLit__123572; })))));
    
    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
      reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(this->FMGL(lifelineStealsPerpetrated), (__extension__ ({ static ::x10::lang::String* strLit__123573 = ::x10aux::makeStringLit(" successful lifeline steals."); strLit__123573; })))));
}

//#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
::x10::lang::String* x10::glb::Logger::sub(::x10::lang::String* str,
                                           x10_int start, x10_int end) {
    return ::x10aux::nullCheck(str)->x10::lang::String::substring(
             start, (__extension__ ({
                 
                 //#line 370 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                 x10_int a__86459 = end;
                 x10_int b__86460 = ::x10aux::nullCheck(str)->x10::lang::String::length();
                 ((a__86459) < (b__86460)) ? (a__86459) : (b__86460);
             }))
             );
    
}

//#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
void x10::glb::Logger::add(::x10::glb::Logger* other) {
    
    //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    this->FMGL(nodesCount) = ((this->FMGL(nodesCount)) + (::x10aux::nullCheck(other)->FMGL(nodesCount)));
    
    //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    this->FMGL(nodesGiven) = ((this->FMGL(nodesGiven)) + (::x10aux::nullCheck(other)->FMGL(nodesGiven)));
    
    //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    this->FMGL(nodesReceived) = ((this->FMGL(nodesReceived)) + (::x10aux::nullCheck(other)->FMGL(nodesReceived)));
    
    //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    this->FMGL(stealsPerpetrated) = ((this->FMGL(stealsPerpetrated)) + (::x10aux::nullCheck(other)->FMGL(stealsPerpetrated)));
    
    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    this->FMGL(lifelineNodesReceived) = ((this->FMGL(lifelineNodesReceived)) + (::x10aux::nullCheck(other)->FMGL(lifelineNodesReceived)));
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    this->FMGL(lifelineStealsPerpetrated) = ((this->FMGL(lifelineStealsPerpetrated)) + (::x10aux::nullCheck(other)->FMGL(lifelineStealsPerpetrated)));
}

//#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
::x10::glb::Logger* x10::glb::Logger::get(x10_boolean verbose) {
    
    //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    if (verbose) {
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
        ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
          reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__123574 = ::x10aux::makeStringLit(""); strLit__123574; })), ((x10_long)::x10aux::here)), (__extension__ ({ static ::x10::lang::String* strLit__123575 = ::x10aux::makeStringLit(" -> "); strLit__123575; }))), ::x10::glb::Logger::sub(
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__123576 = ::x10aux::makeStringLit(""); strLit__123576; })), ((((x10_double) (this->FMGL(timeAlive)))) / (1.0E9))),
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ((x10_int)0),
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ((x10_int)6))), (__extension__ ({ static ::x10::lang::String* strLit__123577 = ::x10aux::makeStringLit(" : "); strLit__123577; }))), ::x10::glb::Logger::sub(
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__123578 = ::x10aux::makeStringLit(""); strLit__123578; })), ((((x10_double) (this->FMGL(timeDead)))) / (1.0E9))),
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ((x10_int)0),
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ((x10_int)6))), (__extension__ ({ static ::x10::lang::String* strLit__123579 = ::x10aux::makeStringLit(" : "); strLit__123579; }))), ::x10::glb::Logger::sub(
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__123580 = ::x10aux::makeStringLit(""); strLit__123580; })), ((((x10_double) (((this->FMGL(timeAlive)) + (this->FMGL(timeDead)))))) / (1.0E9))),
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ((x10_int)0),
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ((x10_int)6))), (__extension__ ({ static ::x10::lang::String* strLit__123581 = ::x10aux::makeStringLit(" : "); strLit__123581; }))), ::x10::glb::Logger::sub(
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__123582 = ::x10aux::makeStringLit(""); strLit__123582; })), ((((100.0) * (((x10_double) (this->FMGL(timeAlive)))))) / (((x10_double) (((this->FMGL(timeAlive)) + (this->FMGL(timeDead)))))))),
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ((x10_int)0),
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ((x10_int)6))), (__extension__ ({ static ::x10::lang::String* strLit__123583 = ::x10aux::makeStringLit("%"); strLit__123583; }))), (__extension__ ({ static ::x10::lang::String* strLit__123584 = ::x10aux::makeStringLit(" :: "); strLit__123584; }))), ::x10::glb::Logger::sub(
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__123585 = ::x10aux::makeStringLit(""); strLit__123585; })), ((((x10_double) (((this->FMGL(startTime)) - (this->FMGL(timeReference)))))) / (1.0E9))),
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ((x10_int)0),
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ((x10_int)6))), (__extension__ ({ static ::x10::lang::String* strLit__123586 = ::x10aux::makeStringLit(" : "); strLit__123586; }))), ::x10::glb::Logger::sub(
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__123587 = ::x10aux::makeStringLit(""); strLit__123587; })), ((((x10_double) (((this->FMGL(lastStartStopLiveTimeStamp)) - (this->FMGL(timeReference)))))) / (1.0E9))),
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ((x10_int)0),
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ((x10_int)6))), (__extension__ ({ static ::x10::lang::String* strLit__123588 = ::x10aux::makeStringLit(" :: "); strLit__123588; }))), this->FMGL(nodesCount)), (__extension__ ({ static ::x10::lang::String* strLit__123589 = ::x10aux::makeStringLit(" :: "); strLit__123589; }))), this->FMGL(nodesGiven)), (__extension__ ({ static ::x10::lang::String* strLit__123590 = ::x10aux::makeStringLit(" : "); strLit__123590; }))), this->FMGL(nodesReceived)), (__extension__ ({ static ::x10::lang::String* strLit__123591 = ::x10aux::makeStringLit(" : "); strLit__123591; }))), this->FMGL(lifelineNodesReceived)), (__extension__ ({ static ::x10::lang::String* strLit__123592 = ::x10aux::makeStringLit(" :: "); strLit__123592; }))), this->FMGL(stealsReceived)), (__extension__ ({ static ::x10::lang::String* strLit__123593 = ::x10aux::makeStringLit(" : "); strLit__123593; }))), this->FMGL(lifelineStealsReceived)), (__extension__ ({ static ::x10::lang::String* strLit__123594 = ::x10aux::makeStringLit(" :: "); strLit__123594; }))), this->FMGL(stealsSuffered)), (__extension__ ({ static ::x10::lang::String* strLit__123595 = ::x10aux::makeStringLit(" : "); strLit__123595; }))), this->FMGL(lifelineStealsSuffered)), (__extension__ ({ static ::x10::lang::String* strLit__123596 = ::x10aux::makeStringLit(" :: "); strLit__123596; }))), this->FMGL(stealsAttempted)), (__extension__ ({ static ::x10::lang::String* strLit__123597 = ::x10aux::makeStringLit(" : "); strLit__123597; }))), ((this->FMGL(stealsAttempted)) - (this->FMGL(stealsPerpetrated)))), (__extension__ ({ static ::x10::lang::String* strLit__123598 = ::x10aux::makeStringLit(" :: "); strLit__123598; }))), this->FMGL(lifelineStealsAttempted)), (__extension__ ({ static ::x10::lang::String* strLit__123599 = ::x10aux::makeStringLit(" : "); strLit__123599; }))), ((this->FMGL(lifelineStealsAttempted)) - (this->FMGL(lifelineStealsPerpetrated))))));
    }
    
    //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
    return this;
    
}

//#line 6 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Logger.x10"
::x10::glb::Logger* x10::glb::Logger::x10__glb__Logger____this__x10__glb__Logger(
  ) {
    return this;
    
}
void x10::glb::Logger::__fieldInitializers_x10_glb_Logger(
  ) {
    this->FMGL(nodesCount) = ((x10_long)0ll);
    this->FMGL(nodesGiven) = ((x10_long)0ll);
    this->FMGL(lifelineNodesReceived) = ((x10_long)0ll);
    this->FMGL(stealsAttempted) = ((x10_long)0ll);
    this->FMGL(stealsPerpetrated) = ((x10_long)0ll);
    this->FMGL(stealsReceived) = ((x10_long)0ll);
    this->FMGL(stealsSuffered) = ((x10_long)0ll);
    this->FMGL(nodesReceived) = ((x10_long)0ll);
    this->FMGL(lifelineStealsAttempted) = ((x10_long)0ll);
    this->FMGL(lifelineStealsPerpetrated) = ((x10_long)0ll);
    this->FMGL(lifelineStealsReceived) = ((x10_long)0ll);
    this->FMGL(lifelineStealsSuffered) = ((x10_long)0ll);
    this->FMGL(lastStartStopLiveTimeStamp) = ((x10_long)-1ll);
    this->FMGL(timeAlive) = ((x10_long)0ll);
    this->FMGL(timeDead) = ((x10_long)0ll);
    this->FMGL(startTime) = ((x10_long)0ll);
}
const ::x10aux::serialization_id_t x10::glb::Logger::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::glb::Logger::_deserializer);

void x10::glb::Logger::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(nodesCount));
    buf.write(this->FMGL(nodesGiven));
    buf.write(this->FMGL(lifelineNodesReceived));
    buf.write(this->FMGL(stealsAttempted));
    buf.write(this->FMGL(stealsPerpetrated));
    buf.write(this->FMGL(stealsReceived));
    buf.write(this->FMGL(stealsSuffered));
    buf.write(this->FMGL(nodesReceived));
    buf.write(this->FMGL(lifelineStealsAttempted));
    buf.write(this->FMGL(lifelineStealsPerpetrated));
    buf.write(this->FMGL(lifelineStealsReceived));
    buf.write(this->FMGL(lifelineStealsSuffered));
    buf.write(this->FMGL(lastStartStopLiveTimeStamp));
    buf.write(this->FMGL(timeAlive));
    buf.write(this->FMGL(timeDead));
    buf.write(this->FMGL(startTime));
    buf.write(this->FMGL(timeReference));
    
}

::x10::lang::Reference* ::x10::glb::Logger::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::glb::Logger* this_ = new (::x10aux::alloc_z< ::x10::glb::Logger>()) ::x10::glb::Logger();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::glb::Logger::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(nodesCount) = buf.read<x10_long>();
    FMGL(nodesGiven) = buf.read<x10_long>();
    FMGL(lifelineNodesReceived) = buf.read<x10_long>();
    FMGL(stealsAttempted) = buf.read<x10_long>();
    FMGL(stealsPerpetrated) = buf.read<x10_long>();
    FMGL(stealsReceived) = buf.read<x10_long>();
    FMGL(stealsSuffered) = buf.read<x10_long>();
    FMGL(nodesReceived) = buf.read<x10_long>();
    FMGL(lifelineStealsAttempted) = buf.read<x10_long>();
    FMGL(lifelineStealsPerpetrated) = buf.read<x10_long>();
    FMGL(lifelineStealsReceived) = buf.read<x10_long>();
    FMGL(lifelineStealsSuffered) = buf.read<x10_long>();
    FMGL(lastStartStopLiveTimeStamp) = buf.read<x10_long>();
    FMGL(timeAlive) = buf.read<x10_long>();
    FMGL(timeDead) = buf.read<x10_long>();
    FMGL(startTime) = buf.read<x10_long>();
    FMGL(timeReference) = buf.read<x10_long>();
}

::x10aux::RuntimeType x10::glb::Logger::rtt;
void x10::glb::Logger::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.glb.Logger",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of Logger */
/*************************************************/
