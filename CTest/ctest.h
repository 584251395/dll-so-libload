#ifndef CTEST_H
#define CTEST_H

#include "ctest_global.h"
#include "ctestdata.h"

class CTESTSHARED_EXPORT CTest
{

public:
    CTest();
};

#endif // CTEST_H



//导出结果
extern "C"{

//求和
int sum(int a,int b);

//获取手动结果
int Target_Manual(FILETIME ftStartTime,FILETIME ftEndTime,Target* pTargets,int& nNum);

//注册回调
int RegisterReceiveDataCallBack(ReceiveData func);
}

