package com.andrei_singeleytsev.tennisapplication.domain.model.impl

import com.andrei_singeleytsev.tennisapplication.domain.model.Ball
import com.andrei_singeleytsev.tennisapplication.domain.model.repository.GameRepository

class GameRepositoryImplementation: GameRepository {
    var ball: Ball? = null
    var screenWidth: Float? = null
    var screenHeight: Float? = null

    fun onUpdate(){
        ball!!.x  += ball!!.velocityX
        ball!!.y += ball!!.velocityY
        checkImpact()
    }

    override fun onStart(screenWidth: Float, screenHeight: Float) {
        this.screenHeight = screenHeight
        this.screenWidth = screenWidth
        ball = Ball(
            x =  2f, // середина экрана по оси X
            y =  2f, // середина экрана по оси Y
            velocityX = 5f, // начальная скорость по оси X
            velocityY = 5f, // начальная скорость по оси Y
            radius = 20f // радиус шарика
        )
    }

    private fun checkImpact(){
        if (ball!!.x - ball!!.radius < 0 || ball!!.x + ball!!.radius > screenWidth!!) {
            ball!!.velocityX *= -1 // меняем направление по оси X
        }

        if (ball!!.y - ball!!.radius < 0 || ball!!.y + ball!!.radius > screenHeight!!) {
            ball!!.velocityY *= -1 // меняем направление по оси Y
        }
    }

}