package com.ideas.game

/**
 * Created by idnasr on 12/11/2014.
 */
class Badge {
    int id
    String badgeName
    String badgeIcon
    String description
    int starsAwarded
    int levelOnePoints
    int levelTwoPoints
    int levelThreePoints
    boolean isEvil
    int displayOrder


    static constraints = {
        badgeName unique: true
        description size:0..1000
    }
    static mapping = {
        sort "displayOrder"
    }
}
