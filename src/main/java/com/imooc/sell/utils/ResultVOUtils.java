package com.imooc.sell.utils;

import com.imooc.sell.VO.ResultVO;

public class ResultVOUtils {

    /**http数据成功返回*/
    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMessage("成功");
        return resultVO;
    }

    /**HTTP请求成功，但没有返回数据*/
    public static ResultVO success(){
        return success(null);
    }

    /**http请求失败*/
    public static ResultVO error(Integer code,String message){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMessage(message);
        return resultVO;
    }

}
