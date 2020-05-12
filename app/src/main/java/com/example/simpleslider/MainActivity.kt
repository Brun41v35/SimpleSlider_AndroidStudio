package com.example.simpleslider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.heinrichreimersoftware.materialintro.app.IntroActivity
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide

class MainActivity : IntroActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)É necessário comentar o layout padrão porque não vamos usar
        //Porque estamos usando o slider, se deixar, o app ficara transparente

        isButtonBackVisible = false
        isButtonNextVisible = false

        addSlide(SimpleSlide.Builder()
                .title("Primeira imagem")
                .description("Descrição 1")
                .image(R.drawable.foguete)
                .background(R.color.colorPrimeiraImagem)
                .build())

        addSlide(SimpleSlide.Builder()
                .title("Segunda imagem")
                .description("Descrição 2")
                .image(R.drawable.dois)
                .background(R.color.colorCinza)
                .build())

        addSlide(SimpleSlide.Builder()
                .title("Terceira imagem")
                .description("Descrição 3")
                .image(R.drawable.tres)
                .background(R.color.colorAzulEscuro)
                .build())
    }
}
