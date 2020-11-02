package by.metelsky.classes.simpleclasses.task8;
/*
 * 8. Создать класс Customer, спецификация которого приведена ниже. 
 * Определить конструкторы, set- и get- методы и метод toString(). 
 * Создать второй класс, агрегирующий массив типа Customer, 
 * с подходящими конструкторами и методами. Задать критерии выбора 
 * данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, 
номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится 
в заданном интервале
 */
public class Customer {
	private int id;
	private String surName;
	private String name;
	private String patronymic;
	private String addres;
	private long creditCardNumber;
	private String bankAccount;

}
