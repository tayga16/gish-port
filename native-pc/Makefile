CXX = g++
CXXFLAGS = -O3 -Wall -std=c++17 -static-libgcc -static-libstdc++
INCLUDES = -Isrc
LIBS = -lmingw32 -lSDL2main -lSDL2 -mwindows

SRCS = src/main.cpp src/renderer.cpp src/physics.cpp src/tilemap.cpp src/audio.cpp
TARGET = Gish.exe

all: $(TARGET)

$(TARGET): $(SRCS)
	$(CXX) $(CXXFLAGS) $(INCLUDES) $(SRCS) -o $(TARGET) $(LIBS)

clean:
	rm -f $(TARGET)
