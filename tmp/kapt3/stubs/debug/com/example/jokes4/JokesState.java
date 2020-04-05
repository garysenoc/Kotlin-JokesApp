package com.example.jokes4;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/example/jokes4/JokesState;", "", "()V", "Complete", "Error", "Loading", "Lcom/example/jokes4/JokesState$Loading;", "Lcom/example/jokes4/JokesState$Complete;", "Lcom/example/jokes4/JokesState$Error;", "app_debug"})
public abstract class JokesState {
    
    private JokesState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/jokes4/JokesState$Loading;", "Lcom/example/jokes4/JokesState;", "()V", "app_debug"})
    public static final class Loading extends com.example.jokes4.JokesState {
        public static final com.example.jokes4.JokesState.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/jokes4/JokesState$Complete;", "Lcom/example/jokes4/JokesState;", "data", "", "Lcom/example/jokes4/Joke;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "app_debug"})
    public static final class Complete extends com.example.jokes4.JokesState {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.example.jokes4.Joke> data = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.example.jokes4.Joke> getData() {
            return null;
        }
        
        public Complete(@org.jetbrains.annotations.NotNull()
        java.util.List<com.example.jokes4.Joke> data) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/jokes4/JokesState$Error;", "Lcom/example/jokes4/JokesState;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "app_debug"})
    public static final class Error extends com.example.jokes4.JokesState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Throwable throwable = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Throwable getThrowable() {
            return null;
        }
        
        public Error(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable throwable) {
            super();
        }
    }
}