package com.bol.interviews.kalaha.model;

import org.junit.Test;

public class BoardTest {

    @Test
    public void players_should_not_have_all_pits_empty()
    {
        //when
        Board board = new Board(new Player("Carl"), new Player("Richard"));
    }

}
