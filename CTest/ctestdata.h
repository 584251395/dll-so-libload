#ifndef CESTDATA_H
#define CESTDATA_H

#endif // CESTDATA_H

typedef unsigned long DWORD;

typedef struct _FILETIME {
    DWORD dwLowDateTime;
    DWORD dwHighDateTime;
} FILETIME;

struct Target
{
    int nFrq;
    FILETIME ftFindTime;		//发现时间
    float fLong;				//经度
    float fLat;					//纬度
    char szLoc[20];			    //位置
    Target()
    {
    }
};

//回调接口
typedef int ReceiveData(Target* pTarget,int nCount);
