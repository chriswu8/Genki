package ca.bcit.androidproject_jameschriskris

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView



class LanguageAdapter(private val mList: List<Pair<String, Int>>, private val activity: Activity) :
    RecyclerView.Adapter<LanguageAdapter.ViewHolder>() {

    // Holds the views
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val button: Button = itemView.findViewById(R.id.button_main_languages)
    }
    interface OnItemClickListener {
        fun onItemClick()
    }

    private var itemClickListener: OnItemClickListener? = null

    fun setOnItemClickListener(listener: OnItemClickListener) {
        itemClickListener = listener
    }

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_languages, parent, false)
        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.button.text = mList[position].first
        holder.button.setCompoundDrawablesRelativeWithIntrinsicBounds(mList[position].second, 0, 0, 0)

        if (position == 6) {
            holder.button.setOnClickListener {
                itemClickListener?.onItemClick()
            }
        }
    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }
}
