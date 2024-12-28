# Bouncing Balls Animation

A JavaFX application that creates an interactive animation of bouncing balls. Users can add new balls by dragging on the screen, and reverse ball directions by clicking them. Each ball features random coloring and physics-based movement.

## About The Project

This animation system demonstrates:
- Real-time physics simulation
- User interaction handling
- JavaFX animation framework
- Dynamic object creation
- Event-driven programming

## Built With

- JavaFX
- Java ArrayList
- Timeline Animation
- Event Handlers

## Core Components

### Classes
1. `Driver`: Main application class
2. `Ball`: Ball object implementation
3. `BallPane`: Animation container and manager

### Features
- Ball physics simulation
- Mouse interaction
- Random color generation
- Collision detection
- Continuous animation

## Implementation Details

### Ball Class
- Extends JavaFX Circle
- Properties:
  - Position (x, y)
  - Velocity (dx, dy)
  - Radius
  - Random color
- Methods:
  - Movement control
  - Boundary collision
  - Direction reversal

### BallPane Class
- Manages multiple balls
- Features:
  - 25ms animation cycle
  - Ball collection management
  - Animation handling
  - Scene container

### Driver Class
- Main application logic
- Handles:
  - Initial setup
  - Mouse events
  - Ball creation
  - User interaction

## User Interactions

1. Add Ball:
   - Click and drag on screen
   - Release to launch ball
   - Direction and speed based on drag vector

2. Reverse Ball:
   - Click any ball to reverse its direction

3. Initial Ball:
   - Program starts with one ball
   - Moves at constant speed (3, 3)

## Technical Features

- Smooth animation using Timeline
- Vector-based ball movement
- Elastic boundary collisions
- Dynamic ball creation
- Event propagation handling

## Animation Details

- Frame rate: 40 FPS (25ms intervals)
- Scene size: 500x500 pixels
- Ball radius: 30 pixels
- Velocity scaling: 1/50 of drag distance

## Physics Implementation

- Boundary detection
- Velocity reversal on collision
- Linear motion
- Vector-based movement
- Elastic collisions with walls

## Usage

1. Run the application
2. Click and drag to create new balls
3. Click existing balls to reverse their direction
4. Watch balls bounce within the window
