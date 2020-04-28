/*************************************************/
/* START of HashMap */
#include <x10/util/HashMap.h>

::x10aux::RuntimeType x10::util::HashMap<void, void>::rtt;
x10_long x10::util::HashMap<void, void>::FMGL(MAX_PROBES);
void x10::util::HashMap<void, void>::FMGL(MAX_PROBES__do_init)() {
    FMGL(MAX_PROBES__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::HashMap<void, void>.MAX_PROBES");
    x10_long __var2676__ = ((x10_long)3ll);
    FMGL(MAX_PROBES) = __var2676__;
    FMGL(MAX_PROBES__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::HashMap<void, void>::FMGL(MAX_PROBES__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(MAX_PROBES__status), &FMGL(MAX_PROBES__do_init), &FMGL(MAX_PROBES__exception), "x10::util::HashMap<void, void>.MAX_PROBES");
    
}
volatile ::x10aux::StaticInitController::status x10::util::HashMap<void, void>::FMGL(MAX_PROBES__status);
::x10::lang::CheckedThrowable* x10::util::HashMap<void, void>::FMGL(MAX_PROBES__exception);
x10_long x10::util::HashMap<void, void>::FMGL(MIN_SIZE);
void x10::util::HashMap<void, void>::FMGL(MIN_SIZE__do_init)() {
    FMGL(MIN_SIZE__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::HashMap<void, void>.MIN_SIZE");
    x10_long __var2677__ = ((x10_long)4ll);
    FMGL(MIN_SIZE) = __var2677__;
    FMGL(MIN_SIZE__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::HashMap<void, void>::FMGL(MIN_SIZE__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(MIN_SIZE__status), &FMGL(MIN_SIZE__do_init), &FMGL(MIN_SIZE__exception), "x10::util::HashMap<void, void>.MIN_SIZE");
    
}
volatile ::x10aux::StaticInitController::status x10::util::HashMap<void, void>::FMGL(MIN_SIZE__status);
::x10::lang::CheckedThrowable* x10::util::HashMap<void, void>::FMGL(MIN_SIZE__exception);

/* END of HashMap */
/*************************************************/
/*************************************************/
/* START of HashMap$HashEntry */
#include <x10/util/HashMap__HashEntry.h>

::x10aux::RuntimeType x10::util::HashMap__HashEntry<void, void>::rtt;

/* END of HashMap$HashEntry */
/*************************************************/
/*************************************************/
/* START of HashMap$EntriesIterator */
#include <x10/util/HashMap__EntriesIterator.h>

::x10aux::RuntimeType x10::util::HashMap__EntriesIterator<void, void>::rtt;

/* END of HashMap$EntriesIterator */
/*************************************************/
/*************************************************/
/* START of HashMap$KeySet */
#include <x10/util/HashMap__KeySet.h>

::x10aux::RuntimeType x10::util::HashMap__KeySet<void, void>::rtt;

/* END of HashMap$KeySet */
/*************************************************/
/*************************************************/
/* START of HashMap$EntrySet */
#include <x10/util/HashMap__EntrySet.h>

::x10aux::RuntimeType x10::util::HashMap__EntrySet<void, void>::rtt;

/* END of HashMap$EntrySet */
/*************************************************/
