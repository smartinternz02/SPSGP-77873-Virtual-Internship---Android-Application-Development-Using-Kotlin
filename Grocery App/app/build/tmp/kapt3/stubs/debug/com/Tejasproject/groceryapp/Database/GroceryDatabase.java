package com.Tejasproject.groceryapp.Database;

import java.lang.System;

@androidx.room.Database(entities = {com.Tejasproject.groceryapp.Database.Entity.GroceryItems.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/Tejasproject/groceryapp/Database/GroceryDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getGroceryDao", "Lcom/Tejasproject/groceryapp/Database/GroceryDao;", "Companion", "app_debug"})
public abstract class GroceryDatabase extends androidx.room.RoomDatabase {
    private static volatile com.Tejasproject.groceryapp.Database.GroceryDatabase instance;
    private static final java.lang.Object LOCK = null;
    public static final com.Tejasproject.groceryapp.Database.GroceryDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.Tejasproject.groceryapp.Database.GroceryDao getGroceryDao();
    
    public GroceryDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0011\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/Tejasproject/groceryapp/Database/GroceryDatabase$Companion;", "", "()V", "LOCK", "instance", "Lcom/Tejasproject/groceryapp/Database/GroceryDatabase;", "createDatabase", "context", "Landroid/content/Context;", "invoke", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.Tejasproject.groceryapp.Database.GroceryDatabase invoke(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final com.Tejasproject.groceryapp.Database.GroceryDatabase createDatabase(android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}