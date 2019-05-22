#include "ctest.h"

CTest::CTest()
{
}

Q_DECL_EXPORT int sum(int a, int b)
{
    return a+b;
}

Q_DECL_EXPORT int Target_Manual(FILETIME ftStartTime,FILETIME ftEndTime,Target* pTargets,int& nNum)
 {
     return -1;
 }

Q_DECL_EXPORT int RegisterReceiveDataCallBack(ReceiveData func)
 {
     return 0;
 }

