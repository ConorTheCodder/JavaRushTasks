package com.javarush.task.jdk13.task34.task3407;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;

/* 
Собиратель типов
*/

// Stream можно частично
public class Solution {

    private Map<TimeUnit, BiFunction<Integer, Long, Map<Boolean, List<String>>>> field;

    public static void main(String[] args) throws Exception {
        getTypes(Solution.class.getDeclaredField("field").getGenericType())
                .forEach(System.out::println);
    }

    public static Set<Type> getTypes(Type type) {
        Set<Type> typesSet = new HashSet<>();
        if (type instanceof ParameterizedType parameterizedType) {
//            typesSet.add(parameterizedType.getRawType());
//            Type[] types = parameterizedType.getActualTypeArguments();
//            for (Type type1 : types) {
//                Set<Type> types1 = getTypes(type1);
//                typesSet.addAll(types1);
//            }
            Arrays.stream(parameterizedType.getActualTypeArguments())
                    .map(Solution::getTypes)
                    .forEach(typesSet::addAll);

        } else {
            typesSet.add(type);
        }

        return typesSet;
    }
}
