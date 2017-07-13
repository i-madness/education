# Awesome Task Scheduler
Тривиальнейший планировщик задач / напоминалка.  
_Цель проекта_ - "because why not", своеобразная разминка.

### Поставленная задача
_[источник](https://vk.com/topic-1279_29549483?post=24443) - в процессе выполнения были сделаны некоторые модификации условия_  
Написать программу, которая выполняет основные функции планировщика задач. Взаимодействие с пользователем осуществляется через консоль.

Планировщик задач состоит из журнала задач, пользовательского интерфейса для добавления и удаления задачи, а также системы оповещения пользователя о каком-то событии. 
Т.е. в назаначенное в планировщике время выводятся системные уведомления, а также сообщения в консоли.  
Журнал задач хранится на диске в формате JSON. При запуске программы, в неё загружаются записи из этого файла; фиксация изменений в файле происходит после добавления 
или удаления записи.  
Параметры планируемой задачи:
- название
- описание
- время (дата) оповещения

### Использованные библиотеки
- Jackson - для работы с JSON