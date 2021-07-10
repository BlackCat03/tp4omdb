package com.blackcat03.movieFinder.findList

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import com.blackcat03.movieFinder.R

class FindMovieListAdapter(context: Context, resource: Int, private val titleArr: ArrayList<String>, private val yearArr: ArrayList<String>, private val posterArr: ArrayList<String>) : ArrayAdapter<String>(context, resource, titleArr) {
    override menuFav getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val row = LayoutInflater.from(context).inflate(R.layout.item_find_list, parent, false)
        val image = row.findViewById<ImageView>(R.id.movieFindIV)
        val title = row.findViewById<TextView>(R.id.movieFindTitleTV)
        val year = row.findViewById<TextView>(R.id.movieFindTYearTV)

        title.text = titleArr[position]
        year.text = yearArr[position]
        Picasso.get().load(posterArr[position]).error(R.drawable.poster).into(image)
        return row
    }
}