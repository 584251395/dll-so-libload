#ifndef CTEST_GLOBAL_H
#define CTEST_GLOBAL_H

#include <QtCore/qglobal.h>

#if defined(CTEST_LIBRARY)
#  define CTESTSHARED_EXPORT Q_DECL_EXPORT
#else
#  define CTESTSHARED_EXPORT Q_DECL_IMPORT
#endif

#endif // CTEST_GLOBAL_H
