
package com.myplaylisapp
package com.example.musicplaylist

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.musicplaylist.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Display song details
        val details = PlaylistManager.getAllDetails()
        binding.tvDetails.text = details.joinToString("\n\n")

        // Show average rating
        binding.btnAverage.setOnClickListener {
            val avg = PlaylistManager.getAverageRating()
            binding.tvDetails.append("\n\nAverage Rating: %.2f".format(avg))
        }

        // Back button
        binding.btnBack.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}
