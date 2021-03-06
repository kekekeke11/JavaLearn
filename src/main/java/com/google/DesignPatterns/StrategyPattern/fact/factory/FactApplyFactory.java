package com.google.DesignPatterns.StrategyPattern.fact.factory;

import com.google.DesignPatterns.StrategyPattern.fact.FactApplyStrategy;
import com.google.DesignPatterns.StrategyPattern.fact.PurposeEnum;

/**
 * @author wk
 * @Description:策略工厂
 * @date 2019/12/24 14:09
 **/
public class FactApplyFactory {

    public static FactApplyStrategy getFactApplyStrategy(Integer code) {
        try {
            return (FactApplyStrategy) Class.forName(PurposeEnum.getEnumObjByCode(code).getClassName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
