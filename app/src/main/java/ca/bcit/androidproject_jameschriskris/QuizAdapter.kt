package ca.bcit.androidproject_jameschriskris

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class QuizAdapter(private val mList: List<Quiz>) :
    RecyclerView.Adapter<QuizAdapter.ViewHolder>() {

    // Holds the views
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val textView: TextView = itemView.findViewById(R.id.textView_result)
        val checkBox1: CheckBox = itemView.findViewById(R.id.checkBox_result_1)
        val checkBox2: CheckBox = itemView.findViewById(R.id.checkBox_result_2)
        val checkBox3: CheckBox = itemView.findViewById(R.id.checkBox_result_3)
        val checkBox4: CheckBox = itemView.findViewById(R.id.checkBox_result_4)
    }

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_quiz, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element

        holder.textView.text = mList[position].question

        holder.checkBox1.text = mList[position].answers[0]
        holder.checkBox2.text = mList[position].answers[1]
        holder.checkBox3.text = mList[position].answers[2]
        holder.checkBox4.text = mList[position].answers[3]

        for (ans in mList[position].correct) {
            when (ans) {
                0 -> holder.checkBox1.text = StringBuilder()
                    .append(holder.checkBox1.text)
                    .append("\t✅").toString()

                1 -> holder.checkBox2.text = StringBuilder()
                    .append(holder.checkBox2.text)
                    .append("\t✅").toString()

                2 -> holder.checkBox3.text = StringBuilder()
                    .append(holder.checkBox3.text)
                    .append("\t✅").toString()

                3 -> holder.checkBox4.text = StringBuilder()
                    .append(holder.checkBox4.text)
                    .append("\t✅").toString()
            }
        }

        for (ans in mList[position].choice) {
            when (ans) {
                0 -> holder.checkBox1.isChecked = true
                1 -> holder.checkBox2.isChecked = true
                2 -> holder.checkBox3.isChecked = true
                3 -> holder.checkBox4.isChecked = true
            }
        }

        holder.checkBox1.isEnabled = false
        holder.checkBox2.isEnabled = false
        holder.checkBox3.isEnabled = false
        holder.checkBox4.isEnabled = false

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

}