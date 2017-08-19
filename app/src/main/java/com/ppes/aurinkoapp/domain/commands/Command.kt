package com.ppes.aurinkoapp.domain.commands

/**
 * Created by ppes on 19/08/2017.
 */

public interface Command<out T> {
    fun execute(): T
}