package com.blez.di

import com.blez.Repository.HeroRepository
import com.blez.Repository.HeroRepositoryImplementation
import org.koin.dsl.module

val koinModule = module{
   single<HeroRepository> { HeroRepositoryImplementation() }


}