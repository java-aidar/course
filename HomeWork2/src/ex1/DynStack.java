package ex1;

import ex1.figure2d.Figure;

import java.util.EmptyStackException;

class DynStack {
    private Figure stck[]; //  private int stck[];
    private int tos;
    // выделить память и инициализировать стек
    DynStack(int size) {
        stck = new Figure[size]; //stck = new int[size];
        tos = -1;
    }

    //    Разместить эемент в стеке
    public void push(Figure item) {
//        если стек заполнен, выделить память
//        под стек большего размера
        if (tos == stck.length - 1) {
            Figure temp[] = new Figure[stck.length * 2];
//            удвоить размер стека
            for (int i = 0; i < stck.length; i++) {
                temp[i] = stck[i];
            }
            stck = temp;
            stck[++tos] = item;
        } else {
            stck[++tos] = item;
        }
    }

    public Figure pop() {
        if (tos < 0) {
            throw new EmptyStackException();
        }
        return stck[tos--];

    }

    }


