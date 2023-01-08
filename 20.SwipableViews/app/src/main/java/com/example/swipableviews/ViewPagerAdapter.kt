package com.example.swipableviews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_view_pager.view.*

class ViewPagerAdapter(val images: List<Int>) : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {

        inner class ViewPagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

        // the below 3 override fun can be imported using CTRL+I.
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
                // we need to get the context from this parent parameter because we don't have the context in an adapter class by default.
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view_pager, parent, false)
                return ViewPagerViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
                val curImage = images[position]
                holder.itemView.ivImage.setImageResource(curImage)
        }

        override fun getItemCount(): Int {
                return images.size
        }
}