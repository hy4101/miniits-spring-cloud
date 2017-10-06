//package com.miniits.swagger2;
//
//import com.google.gson.*;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.spring.web.json.Json;
//
//import java.lang.reflect.Type;
//
///**
// * @author: wq
// * @Date: 2017/10/5
// * @Time: 21:00
// * <p>
// * Description:
// * ***
// */
//@Configuration
//public class WebMvcConfig {
//
//    //    @Override
////    public void addResourceHandlers(ResourceHandlerRegistry registry) {
////        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/js/");
////        registry.addResourceHandler("swagger-ui.html")
////                .addResourceLocations("classpath:/resources/");
////        registry.addResourceHandler("/webjars/**")
////                .addResourceLocations("classpath:/META-INF/resources/webjars/");
////    }
//    private Gson createGson(FieldNamingPolicy policy) {
//        return new GsonBuilder()
//                .setFieldNamingPolicy(policy)
//                //Register SpringFox Json.class adapter
//                .registerTypeAdapter(Json.class, new SpringfoxJsonToGsonAdapter())
//                .create();
//    }
//
//    public static class SpringfoxJsonToGsonAdapter implements JsonSerializer<Json> {
//        @Override
//        public JsonElement serialize(Json src, Type typeOfSrc, JsonSerializationContext context) {
//            final JsonParser parser = new JsonParser();
//            return parser.parse(src.value());
//        }
//    }
//
////    @Override
////    public void addResourceHandlers(ResourceHandlerRegistry registry) {
////        registry.addResourceHandler("swagger-ui.html")
////                .addResourceLocations("classpath:/META-INF/resources/");
////
////        registry.addResourceHandler("/webjars/**")
////                .addResourceLocations("classpath:/META-INF/resources/webjars/");
////    }
//}
