package com.example.contatosbootcamp

import android.provider.ContactsContract

data class Contact (val name : String, val phoneNome : String , val email: ContactsContract.CommonDataKinds.Email)

