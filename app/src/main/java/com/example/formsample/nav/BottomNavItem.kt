package com.example.formsample.nav

import com.example.formsample.R

sealed class BottomNavItem (val icon: Int, val screenRoute: String) {
    object Home: BottomNavItem(R.drawable.icon_home_mono, "home")
    object Search: BottomNavItem(R.drawable.icon_search_mono, "search")
    object Likes: BottomNavItem(R.drawable.icon_favorite_mono, "likes")
    object Chats: BottomNavItem(R.drawable.icon_chat_mono, "chat")
    object Profile: BottomNavItem(R.drawable.icon_profile_mono, "profile")
}