package org.example;

import java.util.ArrayList;

public class WordCRUD implements ICRUD{
    ArrayList<Word> list;


    WordCRUD(){
        list = new ArrayList<>();
    }
    @Override
    public Object add() {
        System.out.print("=> 난이도(1, 2, 3) & 새 단어 입력 : ");
        return null;
    }

    public void addWord() {

    }
    @Override
    public int update(Object obj) {
        return 0;
    }

    @Override
    public int delete(Object obj) {
        return 0;
    }

    @Override
    public void selectOne(int id) {

    }
}
