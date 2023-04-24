package ca.bcit.androidproject_jameschriskris

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class AlphabetCharacter(var character: String, var header: String, var subheader: String,
                        var resourceID: Int) : Parcelable
