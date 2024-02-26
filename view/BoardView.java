package view;

import builder.BoardBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import model.BoardDTO;
import serviceImpl.UtilServiceImpl;
import sevice.UtilService;

public class BoardView {
    public BoardView() {
    }

    public static void main(Scanner sc) {
        List<BoardDTO> articles = new ArrayList();
        UtilService utill = UtilServiceImpl.getInstance();

        for(int i = 0; i < 5; ++i) {
            articles.add((new BoardBuilder()).title(utill.createRandomTitle()).content(utill.createRandomContent()).writer(utill.createRandomName()).build());
        }

        Iterator var4 = articles.iterator();

        while(var4.hasNext()) {
            BoardDTO b = (BoardDTO)var4.next();
            System.out.println(b.toString());
        }

        articles.forEach((ix) -> {
            System.out.println(ix.toString());
        });
    }
}
