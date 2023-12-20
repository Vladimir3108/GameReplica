package com.example.gamereplica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.gamereplica.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun getGameChoice(optionsParam: Array<String>): String {
        var choice = optionsParam[(Math.random() * optionsParam.size).toInt()]
        if (choice == "Камень") binding.ImgComputer.setBackgroundResource(R.drawable.imgrock)
        else if (choice == "Ножницы") binding.ImgComputer.setBackgroundResource(R.drawable.imgscissors)
        else if (choice == "Бумага") binding.ImgComputer.setBackgroundResource(R.drawable.imgpaper)
        else if (choice == "Ящерица") binding.ImgComputer.setBackgroundResource(R.drawable.imglizard)
        else binding.ImgComputer.setBackgroundResource(R.drawable.imgspock)
        return choice
    }

    fun BtnRock(view: View)
    {
        val options = arrayOf("Камень","Ножницы","Бумага","Ящерица","Спок")
        val gameChoice = getGameChoice(options)
        binding.ImgPlayer.setBackgroundResource(R.drawable.imgrock)
        if (gameChoice == "Камень") binding.TxtResult.text = "Ничья"
        else if (gameChoice == "Ножницы") binding.TxtResult.text = "Вы выиграли"
        else if (gameChoice == "Бумага") binding.TxtResult.text = "Вы проиграли"
        else if (gameChoice == "Ящерица") binding.TxtResult.text = "Вы выиграли"
        else binding.TxtResult.text = "Вы проиграли"
    }

    fun BtnScissors(view: View)
    {
        val options = arrayOf("Камень","Ножницы","Бумага","Ящерица","Спок")
        val gameChoice = getGameChoice(options)
        binding.ImgPlayer.setBackgroundResource(R.drawable.imgscissors)
        if (gameChoice == "Камень") binding.TxtResult.text = "Вы проиграли"
        else if (gameChoice == "Ножницы") binding.TxtResult.text = "Ничья"
        else if (gameChoice == "Бумага") binding.TxtResult.text = "Вы выиграли"
        else if (gameChoice == "Ящерица") binding.TxtResult.text = "Вы выиграли"
        else binding.TxtResult.text = "Вы проиграли"
    }

    fun BtnPaper(view: View)
    {
        val options = arrayOf("Камень","Ножницы","Бумага","Ящерица","Спок")
        val gameChoice = getGameChoice(options)
        binding.ImgPlayer.setBackgroundResource(R.drawable.imgpaper)
        if (gameChoice == "Камень") binding.TxtResult.text = "Вы выиграли"
        else if (gameChoice == "Ножницы") binding.TxtResult.text = "Вы проиграли"
        else if (gameChoice == "Бумага") binding.TxtResult.text = "Ничья"
        else if (gameChoice == "Ящерица") binding.TxtResult.text = "Вы проиграли"
        else binding.TxtResult.text = "Вы выиграли"
    }

    fun BtnLizard(view: View)
    {
        val options = arrayOf("Камень","Ножницы","Бумага","Ящерица","Спок")
        val gameChoice = getGameChoice(options)
        binding.ImgPlayer.setBackgroundResource(R.drawable.imglizard)
        if (gameChoice == "Камень") binding.TxtResult.text = "Вы проиграли"
        else if (gameChoice == "Ножницы") binding.TxtResult.text = "Вы проиграли"
        else if (gameChoice == "Бумага") binding.TxtResult.text = "Вы выиграли"
        else if (gameChoice == "Ящерица") binding.TxtResult.text = "Ничья"
        else binding.TxtResult.text = "Вы выиграили"
    }

    fun BtnSpock(view: View)
    {
        val options = arrayOf("Камень","Ножницы","Бумага","Ящерица","Спок")
        val gameChoice = getGameChoice(options)
        binding.ImgPlayer.setBackgroundResource(R.drawable.imgspock)
        if (gameChoice == "Камень") binding.TxtResult.text = "Вы выиграли"
        else if (gameChoice == "Ножницы") binding.TxtResult.text = "Вы выиграли"
        else if (gameChoice == "Бумага") binding.TxtResult.text = "Вы проиграли"
        else if (gameChoice == "Ящерица") binding.TxtResult.text = "Вы проиграли"
        else binding.TxtResult.text = "Ничья"
    }
}