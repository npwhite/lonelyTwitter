/*
 * Copyright © 2018 Team X, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact whitefie@ualberta.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a Tweet
 *
 * author: Nicholas Whitefield
 * version: 1.5
 * @see NormalTweet
 * @see ImportantTweet
 */
public abstract class Tweet implements Tweetable {
    private String message;     /* tweet message */
    private Date date;          /* tweet date */

    /**
     * constructs a tweet object given parameters "message"
     *
     * @param message
     */
    Tweet(String message){

        this.message = message;
        date = new Date();
//        message = message;
    }

    /**
     * constructs a tweet object given parameters "message" and "date"
     *
     * @param message tweet message
     * @param date tweet date
     */
    Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public String getMessage(){
        return message;
    }

    /**
     * sets tweet message
     *
     * @param message tweet message
     * @throws TweetTooLongException the tweet message is over 140 characters
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() < 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    /**
     * method to return the date of the tweet
     *
     * @return date date of the tweet
     */
    public Date getDate(){
        return date;
    }

    /**
     * method to set a new date for a tweet
     *
     * @param date new date of tweet
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * method to return whether the invoked tweet is important
     *
     */
    public abstract Boolean isImportant();

    /**
     * method to return the tweet date and tweet message as a single string
     * @return
     */
    public String toString() {
        return date.toString() + " | " + message;
    }

}
