## Java Core (семинары)

### Урок 4. Обработка исключений

1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. 
При подаче массива другого размера необходимо бросить исключение MyArraySizeException.

2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и
просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
ячейке лежит символ или текст вместо числа), должно быть брошено исключение
MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.

3. В методе main() вызвать полученный метод, обработать возможные исключения
MyArraySizeException и MyArrayDataException и вывести результат расчета.

### Реализация

Преобразование и суммирование массива

![lesson4_1](https://github.com/PavelLogeiko/TechSpec_Java/blob/main/Lesson4/Images/lesson4_1.png)

Неправильное значение в массиве

![lesson4_2](https://github.com/PavelLogeiko/TechSpec_Java/blob/main/Lesson4/Images/lesson4_2.png)

Не корректный размер массива

![lesson4_3](https://github.com/PavelLogeiko/TechSpec_Java/blob/main/Lesson4/Images/lesson4_3.png)

