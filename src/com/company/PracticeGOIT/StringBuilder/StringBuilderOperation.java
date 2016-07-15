package com.company.PracticeGOIT.StringBuilder;

/**
 * Created by nikitarozhkov on 24.06.16.
 */
public class StringBuilderOperation {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        int startOfSubstring = 3;
        int endOsSubstring = 5;
        int indexOffset = 4;
        int charIndex = 4;
        //добавляет строку в конец.
        builder.append("new ending");
        //откуда с какого символа удалит подстроку
        builder.delete(startOfSubstring, endOsSubstring);
        //метод вставки, вставляет строку с поределнной позиции.
        builder.insert(indexOffset, "some sub string");
        //метод замены, заменять часть строки
        builder.replace(startOfSubstring,endOsSubstring, "replace");
        //метод заменны одного символа.
        builder.setCharAt(charIndex,'a');

        //тут мы преобразуем в строку Стринг
        String builderString = builder.toString();
        System.out.println(builderString);
    }
}
