package com.miniits.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 控制器基类。提供模型转换，分页规范实现。
 *
 * @author wq
 * @created 2016.08.08 13:54
 */
public class BaseControllerUtil extends AbstractController {

    //日志
    protected static Logger logger = LoggerFactory.getLogger(BaseControllerUtil.class);

    @Autowired
    protected ObjectMapper objectMapper;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        return null;
    }

    public Result getResultList(List detaiModelList, long totalCount, int currPage, int rows) {
        Result result = new Result();
        result.setSuccessFlg(true);
        result.setDetailModelList(detaiModelList);
        result.setTotalCount(totalCount);
        result.setCurrPage(currPage);
        result.setPageSize(rows);
        if (result.getTotalCount() % result.getPageSize() > 0) {
            result.setTotalPage(((int) result.getTotalCount() / result.getPageSize()) + 1);
        } else {
            result.setTotalPage((int) result.getTotalCount() / result.getPageSize());
        }
        return result;
    }

    public Result getResultList(List detaiModelList, Object o, long totalCount, int currPage, int rows) {
        Result result = new Result();
        result.setSuccessFlg(true);
        result.setDetailModelList(detaiModelList);
        result.setObj(o);
        result.setTotalCount(totalCount);
        result.setCurrPage(currPage);
        result.setPageSize(rows);
        if (result.getTotalCount() % result.getPageSize() > 0) {
            result.setTotalPage(((int) result.getTotalCount() / result.getPageSize()) + 1);
        } else {
            result.setTotalPage((int) result.getTotalCount() / result.getPageSize());
        }
        return result;
    }

    public Result getResultList(List detaiModelList, Object o) {
        Result result = new Result();
        result.setSuccessFlg(true);
        result.setDetailModelList(detaiModelList);
        result.setObj(o);
        return result;
    }


    public Result getResultList(List detaiModelList) {
        Result result = new Result();
        result.setSuccessFlg(true);
        result.setDetailModelList(detaiModelList);
        return result;
    }

    public Result success(Object o) {
        Result result = new Result();
        if (null != o)
            result.setObj(o);
        result.setSuccessFlg(true);
        return result;
    }

    public Result error(String errorMsg) {
        Result result = new Result();
        result.setSuccessFlg(false);
        result.setErrorMsg(errorMsg);
        return result;
    }

    public Result error(String errorMsg, Integer errorCode) {
        Result result = new Result();
        result.setSuccessFlg(false);
        result.setErrorMsg(errorMsg);
        result.setErrorCode(errorCode);
        return result;
    }

//    /**
//     * 将实体转换为模型。
//     *
//     * @param source
//     * @param targetCls
//     * @param properties
//     * @param <T>
//     * @return
//     */
//    public <T> T convertToModel(Object source, Class<T> targetCls, String... properties) {
//        if (source == null) {
//            return null;
//        }
//        T target = BeanUtils.instantiate(targetCls);
//        BeanUtils.copyProperties(source, target, propertyDiffer(properties, targetCls));
//        return target;
//    }
//
//    /**
//     * 将实体集合转换为模型集合。
//     *
//     * @param sources
//     * @param targets
//     * @param properties
//     * @param <T>
//     * @return
//     */
//    public <T> Collection<T> convertToModels(Collection sources, Collection<T> targets, Class<T> targetCls, String properties) {
//        if (sources == null) {
//            return null;
//        }
//        Iterator iterator = sources.iterator();
//        while (iterator.hasNext()) {
//            Object source = iterator.next();
//
//            T target = (T) BeanUtils.instantiate(targetCls);
//            BeanUtils.copyProperties(source, target, propertyDiffer(StringUtils.isEmpty(properties) ? null : properties.split(","), targetCls));
//            targets.add(target);
//        }
//
//        return targets;
//    }
//
//    /**
//     * 计算不在类中的属性。
//     *
//     * @return
//     */
//    protected String[] propertyDiffer(String[] properties, Class targetCls) {
//        if (properties == null || properties.length == 0) return null;
//
//        PropertyDescriptor[] targetPds = BeanUtils.getPropertyDescriptors(targetCls);
//        List<String> propertiesList = Arrays.asList(properties);
//        List<String> arrayList = new ArrayList<>();
//
//        for (PropertyDescriptor targetPd : targetPds) {
//            Method writeMethod = targetPd.getWriteMethod();
//            if (writeMethod != null && !propertiesList.contains(targetPd.getName())) {
//                arrayList.add(targetPd.getName());
//            }
//        }
//
//        return arrayList.toArray(new String[arrayList.size()]);
//    }

}