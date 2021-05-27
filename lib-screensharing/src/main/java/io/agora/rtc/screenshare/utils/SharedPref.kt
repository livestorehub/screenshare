package io.agora.rtc.screenshare.utils

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import java.lang.reflect.Type

object SharedPref {
    private var shr: SharedPreferences? = null
    private var editor: SharedPreferences.Editor? = null
    var prefName = "shas_cust"
    operator fun contains(key: String?): Boolean {
        return shr!!.contains(key)
    }

    fun initSharedPref(context: Context) {
        shr =
            context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
        //editor = shr.edit();
    }

    fun saveString(key: String, value: String?) {
        editor = shr!!.edit()
        editor?.putString(key, value)?.apply()
        LoggerClass.i("SharedPref saveString Key:$key", getString(key))
    }

    fun getString(key: String): String? {
        LoggerClass.i("SharedPref getString Key:$key", shr!!.getString(key, ""))
        return shr!!.getString(key, "")
    }

    fun saveInt(key: String?, value: Int) {
        try {
            editor = shr!!.edit()
            editor?.putInt(key, value)?.apply()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

  /*  fun getInt(key: String?): Int {
        return shr!!.getInt(key, 0)
    }


*/
  fun getBoolean(key: String?): Boolean {
      return shr!!.getBoolean(key, false)
  }
    fun saveBoolean(key: String?, value: Boolean) {
        try {
            editor = shr!!.edit()
            editor?.putBoolean(key, value)?.apply()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    /*fun removeshr(key: String) {
        try {
            try {
                editor = shr!!.edit()
                editor?.remove(key)?.apply()
            } catch (e: Exception) {
                e.printStackTrace()
            }
            LoggerClass.i("SharedPref removeshr", "Key:$key")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }*/

    fun saveString(
        className: String,
        context: Context,
        key: String,
        value: String
    ) {
        try {
            shr = context.getSharedPreferences(
                prefName,
                Context.MODE_PRIVATE
            )
            editor = shr?.edit()
            editor?.putString(key, value)?.apply()
            LoggerClass.i(className + "SharedPref saveString", "Key:$key value:$value")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun saveInt(
        className: String,
        context: Context,
        key: String,
        value: Int
    ) {
        try {
            shr = context.getSharedPreferences(
                prefName,
                Context.MODE_PRIVATE
            )
            editor = shr?.edit()
            editor?.putInt(key, value)?.apply()
            LoggerClass.i(className + "SharedPref saveInt", "Key:$key value:$value")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    /*fun saveBoolean(
        className: String,
        context: Context,
        key: String,
        value: Boolean
    ) {
        try {
            shr = context.getSharedPreferences(
                prefName,
                Context.MODE_PRIVATE
            )
            editor = shr?.edit()
            editor?.putBoolean(key, value)?.apply()
            LoggerClass.i(className + "SharedPref saveBoolean", "Key:$key value:$value")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun saveLong(
        className: String,
        context: Context,
        key: String,
        value: Long
    ) {
        try {
            shr = context.getSharedPreferences(
                prefName,
                Context.MODE_PRIVATE
            )
            editor = shr?.edit()
            editor?.putLong(key, value)?.apply()
            LoggerClass.i(className + "SharedPref saveLong", "Key:$key value:$value")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }*/

    fun saveObject(
        `object`: Any?,
        context: Context,
        key: String
    ) {
        shr =
            context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
        editor = shr?.edit()
        val gson = Gson()
        val json = gson.toJson(`object`)
        editor?.putString(key, json)
        editor?.apply()
        LoggerClass.i("SharedPref saveObject", "Key:$key value:$json")
    }

    fun getObject(
        context: Context,
        key: String?,
        classname: Type?
    ): Any? {
        shr =
            context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
        val gson = Gson()
        val json = shr?.getString(key, "")
        return gson.fromJson(json, classname)
    }

    fun getString(
        className: String,
        context: Context,
        key: String
    ): String? {
        shr =
            context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
        val data = shr?.getString(key, "/")
        LoggerClass.i(
            className + "SharedPref getString",
            "Key:" + key + " value:" + data.toString()
        )
        return data
    }

    fun getString(
        className: String,
        context: Context,
        key: String,
        defValue: String?
    ): String? {
        shr =
            context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
        val data = shr?.getString(key, defValue)
        LoggerClass.i(
            className + "SharedPref getString",
            "Key:" + key + " value:" + data.toString()
        )
        return data
    }

    /*fun getBoolean(
        className: String,
        context: Context,
        key: String
    ): Boolean {
        shr =
            context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
        val data: Boolean? = if (key == "Notification") {
            shr?.getBoolean(key, true)
        } else {
            shr?.getBoolean(key, false)
        }
        LoggerClass.i(
            className + "SharedPref getBoolean",
            "Key:$key value:$data"
        )
        return data!!
    }

    fun getInt(
        className: String,
        context: Context,
        key: String
    ): Int {
        shr =
            context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
        val data = shr?.getInt(key, 0)
        LoggerClass.i(className + "SharedPref getInt", "Key:$key value:$data")
        return data!!
    }

    fun getLong(
        className: String,
        context: Context,
        key: String
    ): Long {
        shr =
            context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
        val data = shr?.getLong(key, 0)
        LoggerClass.i(className + "SharedPref getLong", "Key:$key value:$data")
        return data!!
    }*/

    fun cleardata() {
        try {
            editor = shr!!.edit()
            editor?.clear()?.apply()
            LoggerClass.i("SharedPref ", "SharedPref Cleared")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    /*fun getall(className: String?, context: Context): String {
        shr =
            context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
        //  LoggerClass.i(className + "GET ALL SHARED======================", shr.getAll().toString().replace(",", ",\n"));
//        Toast.makeText(context, shr.getAll().toString(), Toast.LENGTH_LONG).show();
        return shr?.getAll().toString().replace(",", ",\n")
    }

    fun getStringEmptyDefault(
        className: String,
        context: Context,
        key: String
    ): String? {
        shr =
            context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
        val data = shr?.getString(key, "")
        LoggerClass.i(
            className + "SharedPref getString",
            "Key:" + key + " value:" + data.toString()
        )
        return data
    }*/
}