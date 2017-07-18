package me.duncanleo.diporto.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import me.duncanleo.diporto.R
import me.duncanleo.diporto.model.Place
import kotlinx.android.synthetic.main.item_place.view.*

/**
 * Created by duncanleo on 18/7/17.
 */
class PlacesRecyclerViewAdapter(private val data: List<Place>) : RecyclerView.Adapter<PlacesRecyclerViewAdapter.ViewHolder>() {

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.item_place, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.name?.text = data[position].name
        if (data[position].reviews.any()) {
            holder?.review?.text = data[position].reviews[0].text
        }
    }

    override fun getItemId(position: Int): Long {
        return super.getItemId(position)
    }

    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        val name: TextView? = itemView?.placeNameTextView
        val review: TextView? = itemView?.placeReviewTextView
    }
}