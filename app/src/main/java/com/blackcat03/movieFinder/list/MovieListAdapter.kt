package com.blackcat03.movieFinder.list

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import com.blackcat03.movieFinder.R

class MovieListAdapter(val contextMain: Context, resource: Int, private val titleArr: ArrayList<String>, private val descriptionArr: ArrayList<String>, private val posterArr: ArrayList<String>) : ArrayAdapter<String>(contextMain, resource, titleArr) {

    override menuFav getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val row = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        val image = row.findViewById<ImageView>(R.id.imageList)
        val title = row.findViewById<TextView>(R.id.movieTitle)
        val description = row.findViewById<TextView>(R.id.movieDescription)

        title.text = titleArr[position]
        description.text = descriptionArr[position]
        Picasso.get().load(posterArr[position]).error(R.drawable.poster).into(image)
        return row
    }
}