/*
 * Copyright © 2018 Team X, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact whitefie@ualberta.ca
 */

package ca.ualberta.cs.lonelytwitter;

/**
 * Created by dezfuli on 1/16/18.
 */
import java.util.Date;

/**
 *  represents a normal tweet
 *
 *  author: Nicholas Whitefield
 *  version: 1.0
 *  @see Tweet
 *  @see ImportantTweet
 */
public class NormalTweet extends Tweet {

    /**
     * constructor for NormalTweet given "message"
     *
     * @param message tweet message
     */
    NormalTweet(String message){
        super(message);
    }

    /**
     * constructor for NormalTweet given "message" and "date"
     *
     * @param message tweet message
     * @param date tweet date
     */
    NormalTweet(String message, Date date){
        super(message, date);
    }

    /**
     * method which returns whether the tweet is important or not
     * @return Boolean.False
     */
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
